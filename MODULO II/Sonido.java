/*
    Proyecto 2.1
    Calcule la distancia de un trueno
    cuyo sonido tarda 7.2 segundos 
    en llegar a usted.
*/
class Sonido { 
    public static void main(String args[]) { 
        double distancia, intervalo, velocidad_sonido; 

        velocidad_sonido = 340; // m/s
        intervalo = 7.2; // s

        distancia = intervalo * velocidad_sonido; 

        System.out.println("Si tardó " + intervalo + " segundos en escuchar el relámpago, este se encuentra a una distancia de: " + distancia + " metros.");
    }
}