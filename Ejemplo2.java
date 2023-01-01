class Ejemplo2 { 
    public static void main(String args[]){
        /*
            En Java todas las variables deben de declararse antes de usarse, más aún, 
            se debe de especificar el tipo de dato que contendrá esa variable en el momento de la
            declaración, para posterior asignación.
        */
        int var1; // declaramos variable de tipo entero (inicialización de variable)
        int var2; // como se ve acá, para declarar una variable utilizamos la notación: tipo_var nombre-var;

        var1 = 1024; // asignamos valor a la variable 

        System.out.println("var1 contiene " + var1);

        var2 = var1 / 2; 

        System.out.print("Var2 contiene var1 / 2: ");
        /*
            print() a diferencia de println(), no muestra el contenido en pantalla, sino que espera a que se genere una nueva línea para
            posicionarse primera y mostrar la concatenación de ambos prints. 
        */
        System.out.println(var2); 

        /* 
            Sobre la declaración de variables: 
            Es posible declarar dos o más variables empleando la misma instrucción de declaración de tipo de dato,
            tan sólo hay que separar los nombres mediantes coma, por ejemplo:

            int var1, var2; <- ambas variables se declaran utilizando una sola instrucción.
        */
    }
}