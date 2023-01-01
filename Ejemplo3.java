/*
    Este programa ilustra las diferencias
    entre int y double.
*/
class Ejemplo3 { 
    public static void main(String args[]){ 
        int var; // declaramos una variable de tipo entero
        double x; // declaramos una variiable de tipo punto flotante

        var = 10; 
        x = 10.0;

        System.out.println("Valor original de var: " + var); 
        System.out.println("Valor original de x: " + x); 
        System.out.println(); // imprime una línea en blanco. 

        // dividimos ambas variables entre 4
        var = var / 4; 
        x = x / 4; 

        System.out.println("Var una vez dividida (componente fraccionario perdido): " + var); 
        System.out.println("X una vez diviidida (componente fraccionario preservado): " + x); 

    }
}