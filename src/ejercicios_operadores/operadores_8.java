package ejercicios_operadores;

import java.util.Scanner;

public class operadores_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  a, b,c;

        System.out.println("Ingrese el valor de a: ");
        a = sc.nextFloat();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextFloat();
        System.out.println("Ingrese el valor de c: ");
        c = sc.nextFloat();

        double discriminante = Math.sqrt(2) - 4 * b * a * c;

        System.out.println("Resultado: "+ discriminante);



    }
}
