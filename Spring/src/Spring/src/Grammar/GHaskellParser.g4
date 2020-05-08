/*
BSD License
Copyright (c) 2020, Evgeniy Slobodkin
All rights reserved.
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the name of Tom Everett nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

parser grammar GHaskellParser;

options { tokenVocab=GHaskellLexer; }

varid : VARID;
conid : CONID;

ascSymbol: '!' | '#' | '$' | '%' | '&' | '*' | '+'
        | '.' | '/' | '<' | '=' | '>' | '?' | '@'
        | '\\' | '^' | '|' | '-' | '~' | ':' ;

varsym : ascSymbol+;
consym : ':' ascSymbol*;

con :    conid   ;
varop:   varsym  | ('`' varid '`')	 ;
conop:   consym  | ('`' conid '`')	 ;
op:      varop   | conop			 ;

module : (topdecl NEWLINE*)* EOF;

tycon : conid;

atype
    :
    tycon
    | varid
    | '(' type ')'
    ;
    
type
    :
    atype+ ('->' type)?
    ;

constr
    :
    con atype*
    ;
    
constrs
    :
    constr ('|' constr)*
    ;
    
simpletype
    :
    tycon var*
    ;
    
var	: varid ;

vars
    :
    var (',' var)*
    ;
    
gendecl
    :
    var '::' type
    ;
    
integer
    :
    DECIMAL
    | OCTAL
    | HEXADECIMAL
    ;


pfloat: FLOAT;
pchar: CHAR;
pstring: STRING;
    
literal : integer | pfloat | pchar | pstring;
    
apat
    :
    var
    | literal
    | '_'
    ;
    
funlhs
    :
    var apat*
    ;
    
lexp
    :
    LET decl* IN exp
    | IF exp THEN exp ELSE exp
    | var
    | literal
    ;

qop:    varop  | conop			 ;    
   
exp
    :
    lexp qop exp
    | '-' exp
    | lexp
    | literal
    | var
    ;
    
rhs
    :
    '=' exp (NEWLINE WHERE decl*)?
    ;
    
decl
    :
    gendecl
    | funlhs rhs
    ;

topdecl
    :
    DATA simpletype ('=' constrs)? NEWLINE
    | decl NEWLINE;