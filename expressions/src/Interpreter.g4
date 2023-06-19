grammar Interpreter;

start
       : expressions+;

expressions
       : numExpression | boolExpression;

numExpression
       : INT
       | LP numExpression RP
       | numExpression (MULT | DIV) numExpression
       | numExpression (PLUS | MINUS) numExpression
       | comment
       ;

boolExpression
       : boolExpression (OR | AND) boolExpression
       | BOOL;

comment
       : COMMENTS;

PLUS   :  '+';
MINUS  :  '-';
MULT   :  '*';
DIV    :  '/';
INT    :  '0'..'9'+;
BOOL   : 'true'|'false';
OR     : '|';
AND    : '&&';
COMMENTS :'#'[a-z]+;
LP :'(';
RP :')';
NEWLINE : [\r\n] -> skip;
SPACE : [ ]+ -> skip;