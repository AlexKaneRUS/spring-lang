using System;
using System.Collections.Generic;
using System.IO;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using JetBrains.Util;
using DFA = Antlr4.Runtime.Dfa.DFA;
using IToken = Antlr4.Runtime.IToken;

namespace Antlr4.Runtime
{
    public abstract class HaskellBaseLexer : Antlr4.Runtime.Lexer {

    public HaskellBaseLexer(ICharStream input) : base(input) {
    }
    
    public HaskellBaseLexer(ICharStream input, TextWriter output, TextWriter errorOutput) : base(input, output, errorOutput)
    {}

    public class Pair<L,R> {
        private readonly L left;
        private readonly R right;
        public Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }

        public L first() { return left; }
        public R second() { return right; }
    }

    bool pendingDent = true;

    // Current indent
    private int indentCount = 0;
    // A queue where extra tokens are pushed on
    private LinkedList<IToken> tokenQueue = new LinkedList<IToken>();
    // The stack that keeps key word and indent after that
    private Stack<Pair<String, int>> indentStack = new Stack<Pair<String, int>>();
    // Pointer keeps last indent token
    private IToken initialIndentToken = null;
    private String  lastKeyWord = "";

    private bool prevWasEndl = false;
    private bool prevWasKeyWord = false;
    // Need, for example, in {}-block
    private bool ignoreIndent = false;
    // Check moment, when you should calculate start indent
    // module ... where {now you should remember start indent}
    private bool moduleStartIndent = false;
    private bool wasModuleExport   = false;

    // Haskell saves indent before first() symbol as null indent
    private int startIndent = -1;
    // Count of "active" key words in this moment
    private int nestedLevel = 0;

    protected void processNEWLINEToken() {
        if (pendingDent) { base.Channel = Hidden; }
        indentCount = 0;
        initialIndentToken = null;
    }

    protected void processTABToken() {
        base.Channel = Hidden;
        if (pendingDent) {
            indentCount += 8*Text.Length;
        }
    }

    protected void processWSToken() {
        base.Channel = Hidden;
        if (pendingDent) {
            indentCount += Text.Length;
        }
    }

    private int getSavedIndent() { return indentStack.IsEmpty() ? startIndent : indentStack.Peek().second(); }

    private IToken
    createToken(int type, String text, IToken next) {
        CommonToken token = new CommonToken(type, text);
        if (initialIndentToken != null) {
            token.StartIndex = initialIndentToken.StartIndex;
            token.Line = initialIndentToken.Line;
            token.Column = initialIndentToken.Column;
            token.StopIndex = next.StartIndex - 1;
        }
        return token;
    }

    private void processINToken(IToken next) {
        while (!indentStack.IsEmpty() && indentStack.Peek().first() != "let") {
            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.SEMI, "SEMI", next)));
            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VCCURLY, "VCCURLY", next)));
            nestedLevel--;
            indentStack.Pop();
        }

        if (!indentStack.IsEmpty() && indentStack.Peek().first() == "let") {
            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.SEMI, "SEMI", next)));
            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VCCURLY, "VCCURLY", next)));
            nestedLevel--;
            indentStack.Pop();
        }
    }

    private void processEofToken(IToken next) {
        indentCount = startIndent;
        if (!pendingDent) {
            initialIndentToken = next;
        }

        while (nestedLevel > indentStack.Count) {
            if (nestedLevel > 0)
                nestedLevel--;

            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.SEMI, "SEMI", next)));
            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VCCURLY, "VCCURLY", next)));
        }

        while (indentCount < getSavedIndent()) {
            if (!indentStack.IsEmpty() && nestedLevel > 0) {
                indentStack.Pop();
                nestedLevel--;
            }

            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.SEMI, "SEMI", next)));
            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VCCURLY, "VCCURLY", next)));
        }

        if (indentCount == getSavedIndent()) {
            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.SEMI, "SEMI", next)));
        }

        if (wasModuleExport) {
            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VCCURLY, "VCCURLY", next)));
        }

        startIndent = -1;
    }

    // Algorithm's description here:
    // https://www.haskell.org/onlinereport/haskell2010/haskellch10.html
    // https://en.wikibooks.org/wiki/Haskell/Indentation
    public override IToken NextToken() {
        if (!tokenQueue.IsEmpty()) {
            return tokenQueue.First.Value;
        }

        IToken next = base.NextToken();
        int   type = next.Type;

        if (startIndent == -1
            && type != GHaskellLexer.NEWLINE
            && type !=  GHaskellLexer.WS
            && type !=  GHaskellLexer.TAB
            && type != GHaskellLexer.OCURLY) {
            if (type ==  GHaskellLexer.MODULE) {
                moduleStartIndent = true;
                wasModuleExport = true;
            } if (type !=  GHaskellLexer.MODULE && !moduleStartIndent) {
                startIndent = next.Column;
            } else if (lastKeyWord == "where" && moduleStartIndent) {
                lastKeyWord = "";
                prevWasKeyWord = false;
                nestedLevel = 0;
                moduleStartIndent = false;
                prevWasEndl = false;
                startIndent = next.Column;
                tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VOCURLY, "VOCURLY", next)));
                tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(type, next.Text, next)));

                return tokenQueue.First.Value;
            }
        }

        if (type == GHaskellLexer.OCURLY) {
            if (prevWasKeyWord) {
                nestedLevel--;
                prevWasKeyWord = false;
            }

            if (moduleStartIndent) {
                moduleStartIndent = false;
                // because will be  GHaskellLexer.CCURLY in the end of file
                wasModuleExport = false;
            }

            ignoreIndent = true;
            prevWasEndl = false;
        }

        if (prevWasKeyWord && !prevWasEndl
            && !moduleStartIndent
            && type !=  GHaskellLexer.WS
            && type != GHaskellLexer.NEWLINE
            && type !=  GHaskellLexer.TAB
            && type != GHaskellLexer.OCURLY) {
            prevWasKeyWord = false;
            indentStack.Push(new Pair<String, int>(lastKeyWord, next.Column));
            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VOCURLY, "VOCURLY", next)));
        }

        if (ignoreIndent
            && (type == GHaskellLexer.WHERE
            || type == GHaskellLexer.DO
            || type == GHaskellLexer.LET
            || type ==  GHaskellLexer.OF
            || type ==  GHaskellLexer.CCURLY)
           ) {
            ignoreIndent = false;
        }

        if (pendingDent
            && prevWasKeyWord
            && !ignoreIndent
            && indentCount <= getSavedIndent()
            && type != GHaskellLexer.NEWLINE
            && type !=  GHaskellLexer.WS) {

            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VOCURLY, "VOCURLY", next)));
            prevWasKeyWord = false;
            prevWasEndl = true;
        }


        if (pendingDent && prevWasEndl
            && !ignoreIndent
            && indentCount <= getSavedIndent()
            && type != GHaskellLexer.NEWLINE
            && type !=  GHaskellLexer.WS
            && type != GHaskellLexer.WHERE
            && type !=  GHaskellLexer.IN
            && type != GHaskellLexer.DO
            && type !=  GHaskellLexer.OF
            && type !=  GHaskellLexer.CCURLY
            && type != Eof) {

            while (nestedLevel > indentStack.Count) {
                if (nestedLevel > 0)
                    nestedLevel--;

                tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.SEMI, "SEMI", next)));
                tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VCCURLY, "VCCURLY", next)));
            }

            while (indentCount < getSavedIndent()) {
                if (!indentStack.IsEmpty() && nestedLevel > 0) {
                    indentStack.Pop();
                    nestedLevel--;
                }

                tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.SEMI, "SEMI", next)));
                tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VCCURLY, "VCCURLY", next)));
            }

            if (indentCount == getSavedIndent()) {
                tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.SEMI, "SEMI", next)));
            }

            prevWasEndl = false;
            if (indentCount == startIndent) {
                pendingDent = false;
            }
        }


        if (pendingDent && prevWasKeyWord
            && !moduleStartIndent
            && !ignoreIndent
            && indentCount > getSavedIndent()
            && type != GHaskellLexer.NEWLINE
            && type !=  GHaskellLexer.WS
            && type != Eof) {

            prevWasKeyWord = false;

            if (prevWasEndl) {
                indentStack.Push(new Pair<String, int>(lastKeyWord, indentCount));
                prevWasEndl = false;
            }

            tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VOCURLY, "VOCURLY", next)));
        }

        if (pendingDent
            && initialIndentToken == null
            && GHaskellLexer.NEWLINE != type) {
            initialIndentToken = next;
        }

        if (next != null && type == GHaskellLexer.NEWLINE) {
            prevWasEndl = true;
        }

        if (type == GHaskellLexer.WHERE
            || type == GHaskellLexer.LET
            || type == GHaskellLexer.DO
            || type ==  GHaskellLexer.OF) {
            // if next will be GHaskellLexer.OCURLY need to decrement nestedLevel
            nestedLevel++;
            prevWasKeyWord = true;
            prevWasEndl = false;
            lastKeyWord = next.Text;

            if (type == GHaskellLexer.WHERE) {
                if (!indentStack.IsEmpty() && (indentStack.Peek().first() == "do")) {
                    tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.SEMI, "SEMI", next)));
                    tokenQueue.AddLast(new LinkedListNode<IToken>(createToken(GHaskellLexer.VCCURLY, "VCCURLY", next)));
                    indentStack.Pop();
                    nestedLevel--;
                }
            }
        }

        if (next != null && type == GHaskellLexer.OCURLY) {
            prevWasKeyWord = false;
        }

        if (next == null || Hidden == next.Channel || GHaskellLexer.NEWLINE == type) {
            return next;
        }

        if (type ==  GHaskellLexer.IN) {
            processINToken(next);
        }

        if (type == Eof) {
            processEofToken(next);
        }

        pendingDent = true;
        tokenQueue.AddLast(new LinkedListNode<IToken>(next));

        return tokenQueue.First.Value;
    }
}
}