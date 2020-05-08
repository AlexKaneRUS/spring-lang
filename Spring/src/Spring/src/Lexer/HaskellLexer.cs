using JetBrains.ReSharper.Psi.Parsing;
using JetBrains.Text;
using Antlr4.Runtime;

namespace JetBrains.ReSharper.Plugins.Haskell.Lexer
{
    public class HaskellLexer : ILexer<int>
    {
        private readonly GHaskellLexer _lexer;

        private IToken _currentToken;
        private int _currentPosition;

        public HaskellLexer(IBuffer buffer)
        {
            Buffer = buffer;
            _lexer = new GHaskellLexer(new AntlrInputStream(buffer.GetText()));
            _currentPosition = 0;
        }
        
        public void Start()
        {
            Advance();
        }

        public void Advance()
        {
            _currentToken = _lexer.NextToken();
            _currentPosition++;
        }

        public int CurrentPosition
        {
            get => _currentPosition;
            set
            {
                _lexer.Reset();
                
                var counter = 0;
                while (counter < value)
                {
                    Advance();
                    counter++;
                }
            }
        }

        object ILexer.CurrentPosition
        {
            get => CurrentPosition;
            set => CurrentPosition = (int) value;
        }

        public TokenNodeType TokenType => _currentToken.Type == -1 ? null : 
            HaskellTokenType.GetTokenType(_currentToken.Type);

        public int TokenStart => _currentToken.StartIndex;

        public int TokenEnd => _currentToken.StopIndex + 1;
        
        public IBuffer Buffer { get; }
    }
}