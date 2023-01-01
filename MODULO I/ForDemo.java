/*
    Demostración bucle for

    for (inicialización, condición, iteración) instrucción; 
    for (inicialización, condición, iteración) { 
        // instrucciones
    }

    inicialización: se le asigna un valor inicial a una variable de control del bucle, por convención "i"
    condición: expresión booleana que prueba la variable de control de bucle, si el resultado es verdadero, el bucle for sigue repitiéndose.
    iteración: determina la manera en la que la variable de control de bucle cambia cada vez que el bucle se repite.
*/
class ForDemo {
    public static void main(String args[]) { 
        int cuenta; 

        for(cuenta = 0; cuenta < 5; cuenta++) {  
            System.out.println("Esta es la cuenta: " + cuenta);
        }

        System.out.println("Fin");
    }
}