grammar Bank;

transactions returns [int totalAmount]: BT movements ET;
movements returns [int totalAmount] : move '.'  (move '.')* ;
move returns [int totalAmount] : data ';' destAccount ';' signal ';' ammount ';' originAccount ';' description ;
destAccount : ID;
signal : CREDIT
      | DEBIT;
ammount : INT;
originAccount : ID;
description : ESCAPED_STRING;
data : INT;
BT :'-#';
ET :'#-';
CREDIT : 'CREDIT';
DEBIT : 'DEBIT';
INT:[0-9]+;
ID : [A-Z|a-z|0-9]+;
ESCAPED_STRING:'"'[a-z|A-Z| ]+'"';
WS:[ \n\t] -> skip;