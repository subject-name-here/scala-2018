grammar Exp;


eval returns [int value]
    :    exp=orExp {$value = $exp.value;}
    ;

orExp returns [int value]
    :    m1=andExp        {$value = $m1.value;}
         ( '||' m2=andExp {$value = ($value == 0) ? ($m2.value == 0 ? 0 : 1) : 1;}
         )*
    ;

andExp returns [int value]
    :    m1=equalExp        {$value = $m1.value;}
         ( '&&' m2=equalExp {$value = ($value == 0) ? 0 : ($m2.value == 0 ? 0 : 1);}
         )*
    ;

equalExp returns [int value]
    :    m1=greaterLessExp        {$value = $m1.value;}
         ( '==' m2=greaterLessExp {$value = $value == $m2.value ? 1 : 0;}
         | '!=' m2=greaterLessExp {$value = $value != $m2.value ? 1 : 0;}
         )*
    ;

greaterLessExp returns [int value]
    :    m1=additionExp        {$value = $m1.value;}
         ( '>' m2=additionExp  {$value = $value > $m2.value ? 1 : 0;}
         | '<' m2=additionExp  {$value = $value < $m2.value ? 1 : 0;}
         | '>=' m2=additionExp {$value = $value >= $m2.value ? 1 : 0;}
         | '<=' m2=additionExp {$value = $value <= $m2.value ? 1 : 0;}
         )*
    ;

additionExp returns [int value]
    :    m1=multiplyExp       {$value = $m1.value;}
         ( '+' m2=multiplyExp {$value += $m2.value;}
         | '-' m2=multiplyExp {$value -= $m2.value;}
         )*
    ;

multiplyExp returns [int value]
    :    m1=atomExp       {$value = $m1.value;}
         ( '*' m2=atomExp {$value *= $m2.value;}
         | '/' m2=atomExp {$value /= $m2.value;}
         | '%' m2=atomExp {$value %= $m2.value;}
         )*
    ;

atomExp returns [int value]
    :    n=Number          {$value = Integer.parseInt($n.text);}
    |    '(' exp=orExp ')' {$value = $exp.value;}
    ;


Number
    :    ('-')? ('1'..'9') ('0'..'9')*
    |    '0'
    ;

WS : (' ' | '\t' | '\r'| '\n') -> skip;
