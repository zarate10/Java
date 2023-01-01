/*
    Demostración if

    if (condición) instrucción; 
    if (condición) { 
        // instrucciones
    }

    Condición expresión booleana. 

    Operadores de relación
    <           
    <= 
    > 
    >= 
    == 
    !=  

    Operadores aritméticos
    -
    +
    *
    /
    %

    Operadores aritméticos combiniados 
    += 
    -= 
    *= 
    /= 
    %= 

    Operadores incrementales
    ++ 
    -- 

    Operador condicional/ternario
    expresiónLógica ? expresion_si : expresion_no
*/
class IfDemo { 
    public static void main(String args[]) { 
        int a, b, c; 

        a = 2; 
        b = 3; 

        if (a < b) System.out.println("a es menor que b"); 

        // esto no despliega nada
        if (a == b) System.out.println("no va a ver esto"); 

        System.out.println(); 

        c = a - b; // c contiene -1 

        System.out.println("c contiene -1"); 
        if (c >= 0) System.out.println("c no es negativo"); 
        if (c < 0) System.out.println("c es negativo"); 

        System.out.println();

        c = b - a; // c contiene 1

        System.out.println("c contiene 1"); 
        if (c >= 0) System.out.println("c no es negativo"); 
        if (c < 0) System.out.println("c es negativo"); 
    }
}
