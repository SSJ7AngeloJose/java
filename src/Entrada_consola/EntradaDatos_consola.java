package Entrada_consola;

import java.util.Scanner;

public class EntradaDatos_consola {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int number ;
        System.out.println("Digite um numero");
        number = entrada.nextInt();
        System.out.print("el numero es:" + number);



     /*   Scanner entrada = new Scanner(System.in);
        float numero;
        System.out.println("ingrese el valor de entrada :");
        numero = entrada.nextFloat();
        System.out.print("el numero es : " + numero); */

/*  Scanner entrada1 = new Scanner(System.in);
        short number1;
        System.out.println("Ingrese el numero de la opcion 1:");
        number1 = entrada1.nextShort();
        System.out.print("resultado es :" + number1);
        */

     /*  Scanner sc = new Scanner(System.in); //para la entrada de datos
       double  decimal;
       System.out.println("ingrese numero decimal :" );
       decimal = sc.nextDouble();
       System.out.print("el numero decimal es = " + decimal); */


    }
}
