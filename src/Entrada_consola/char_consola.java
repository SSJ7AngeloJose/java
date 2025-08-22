package Entrada_consola;

import java.util.Scanner;

public class char_consola {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       char letra;
       System.out.println("Digite el valor del caracter: ");
        letra = sc.next().charAt(0);
       System.out.println("Digite el valor del caracter: " + letra);



    }
}
