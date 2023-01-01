/* 
    Punto 9 del módulo 1 del libro de Fundamentos de Java de Herbert Schildt. 

    La gravedad de la luna es de alrededor del 17% la de la Tierra. 
    Escriba un programa que calcule su peso efectivo en la luna.
*/
class PesoEnLaLuna { 
    public static void main(String args[]) { 
        double peso, kg, gravedad_tierra, gravedad_luna; 

        gravedad_tierra = 9.81; // m/s^2
        gravedad_luna = gravedad_tierra * 0.17; 

        for (kg = 1; kg <= 100; kg++) { 
            peso = (kg / gravedad_tierra) * gravedad_luna;
            System.out.println(kg + " kg en la luna equivale a: " + peso);
        }
    }
}