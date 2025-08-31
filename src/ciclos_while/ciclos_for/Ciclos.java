package ciclos_while.ciclos_for;

import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args){
        //inicializacion, condicion, actualizacion incremento

        Scanner sc = new Scanner(System.in);
        int contador;
        System.out.println("Ingrese numero: ");
        contador = sc.nextInt();
      /* pares
             for (int i = 2; i <= contador; i+=2){
            System.out.println("El valor de i es: " + i);
        }
        o impares*/
        for (int i = 1; i <= contador; i++){
            System.out.println("El valor de i es: " + i);
        }


        //inicializacion, condicion, actualizacion incremento
        for (int i= 1; i <= 10; i++){
            System.out.println("El valor de i es: " + i);
        }


    //decremento
     for (int i = 10; i >= 1; i--){
            System.out.println("El valor de i es: " + i);
    }

}
}