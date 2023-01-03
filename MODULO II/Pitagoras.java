/* 
    Use el teorema de Pitágoras para 
    encontrar la longitud de la hipotenusa 
    dadas las longitudes de los lados opuestos.
*/
class Hipot { 
    public static void main(String args[]) { 
        double x, y, z; 

        x = 3; 
        y = 4; 

        z = Math.sqrt(x*x + y*y); 

        System.out.println("La hipotenusa es: " + z);
    }
}