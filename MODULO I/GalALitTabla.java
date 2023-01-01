class GalALitTabla { 
    public static void main(String args[]) { 
        double i; 

        for (i = 0; i < 100; i++) { 
            System.out.println(i + " galones es igual a " + i * 3.7854 + " litros.");
            if (i % 10 == 0) System.out.println();
        }

    }
}