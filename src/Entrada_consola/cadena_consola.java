package Entrada_consola;

import java.util.Scanner;

public class cadena_consola {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cadena;

        System.out.println("Digite la cadena a ser criada: ");
        cadena = sc.nextLine();

        System.out.print("la cadena es : " + cadena);
    }
}
