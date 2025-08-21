package operadores;

public class operadorincrementosydecremento {
    public static  void main(String[] args){
        // /*
        // int x = 5;
        //      x ++; // Incremento
        //       x --; // Decremento
        //        System.out.println("Incremento: " + x); // Imprime 6
        // */

        int x = 5, y ;
        y = x++; // Post-incremento
        y = ++x; // Pre-incremento
        System.out.println("El numero es: " + y);



    }

}
