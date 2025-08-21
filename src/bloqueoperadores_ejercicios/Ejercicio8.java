package bloqueoperadores_ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c;

        System.out.println("Introduce el valor de a:");
        a = entrada.nextDouble();

        System.out.println("Introduce el valor de b:");
        b = entrada.nextDouble();

        System.out.println("Introduce el valor de c:");
        c = entrada.nextDouble();

        // Calculamos el discriminante
        double discriminante = (b * b) - (4 * a * c);
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        System.out.println("El valor del discriminante es: " + discriminante);
        System.out.println("Raíz x1: " + x1);
        System.out.println("Raíz x2: " + x2);
    }
}
