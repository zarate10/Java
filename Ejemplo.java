/*
    Éste es un programa simple de Java. 

    javac -> para compilar el código fuente. 
    java -> intérprete de java para ejecutar el código fuente.
*/
class Ejemplo { 
    // Un programa de Java siempre empieza con una llamada al método main()
    public static void main(String args[]) {
    /* 
        A partir de la línea del llamado al método main, el programa empezará a ejecutarse.

        public -> especificador de acceso: determina la manera en la que otras partes del programa pueden acceder a los miembros de la clase. 
        static -> permite que main sea llamado por el intérprete de Java antes de que se instancie un objeto de la clase "Ejemplo". 
        void -> simplemente indica que el método (función) no retornará ningún valor.
    */
        System.out.println("Java dirige Web");
        /* 
            System es una clase predefinida que proporciona acceso al sistema, y out es un flujo de salida por consola.

            La instrucción "println" termina con un punto y coma, en Java, todas las instrucciones deben terminar con punto y coma obligatoriamente.
        */

    }
}