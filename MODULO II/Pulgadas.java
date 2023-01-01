/* 
    Java define cuatro tipos de enteros: byte, short, int y long. 

    TIPO        ANCHO EN BITS       RANGO

    byte        8                   -128 a 127
    short       16                  -32,768 a 32,767
    int         32                  -2,147,483,648 a 2,147,483,647
    long        64                  -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

*/
/* 
    Este programa calcula el número de pulgadas cúbicas 
    en una milla cúbica. 
*/
class Pulgadas { 
    public static void main(String args[]) { 
        long pc; 
        long pm; 

        pm = 5280 * 12; 

        pc = pm * pm * pm; 

        System.out.println("Hay " + pc + " pulgadas cúbicas en una milla cúbica.");
    }
}