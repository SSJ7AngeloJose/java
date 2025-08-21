package cadenadatos;

import java.util.Scanner;

public class cadenadeDatos {

    public static void main(String[] args) {
        //cadena de texto
        Scanner entrada = new Scanner(System.in);
        String Cadena;

    System.out.println("Ingrese lo que esta comprando: ");
        Cadena = entrada.nextLine();
    System.out.println("el producto es : " + Cadena);

    //con double
        Double numero;
        System.out.println("Ingrese la cantidad de platano que esta llevando : ");
        numero = entrada.nextDouble();
        System.out.println("La cantidad es  : " + numero);
        System.out.println("resultado final: " + Cadena  + " " +  numero + "kg  ");


        // con charAt
        char letra;
        System.out.println("Ingrese la letra que desea saber su posicion la primera posiciones: ");
        letra = entrada.next().charAt(0);
        System.out.println("La letra ingresada es: " + letra);

    }
}
