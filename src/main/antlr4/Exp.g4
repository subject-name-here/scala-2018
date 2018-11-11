grammar Exp;


eval
    :    exp=orExp EOF
    ;

orExp
    :    m1=andExp
         ( '||' m2=andExp
         )*
    ;

andExp
    :    m1=equalExp
         ( '&&' m2=equalExp
         )*
    ;

equalExp
    :    m1=greaterLessExp
         ( '==' m2=greaterLessExp
         | '!=' m2=greaterLessExp
         )*
    ;

greaterLessExp
    :    m1=additionExp
         ( '>' m2=additionExp
         | '<' m2=additionExp
         | '>=' m2=additionExp
         | '<=' m2=additionExp
         )*
    ;

additionExp
    :    m1=multiplyExp
         ( '+' m2=multiplyExp
         | '-' m2=multiplyExp
         )*
    ;

multiplyExp
    :    m1=atomExp
         ( '*' m2=atomExp
         | '/' m2=atomExp
         | '%' m2=atomExp
         )*
    ;

atomExp
    :    n=Number
    |    '(' exp=orExp ')'
    ;


Number
    :    ('-')? ('1'..'9') ('0'..'9')*
    |    '0'
    ;

WS : (' ' | '\t' | '\r'| '\n') -> skip;