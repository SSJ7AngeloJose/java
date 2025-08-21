package bloqueoperadores_ejercicios;

import java.util.Scanner;

//hacer un programa que calcule el cuadrado de una suma
//(a+b)2 = a2 + b2 + 2ab

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a, b , resultado;

        System.out.println("Introduce el valor de a: ");
        a = entrada.nextFloat();
        System.out.println("Introduce el valor de b: ");
        b = entrada.nextFloat();

        resultado = (a * a)  +   (2 * a * b)+ (b * b);

        System.out.println("La suma de los cuadrados es: " + resultado);
        entrada.close();


    }
}
