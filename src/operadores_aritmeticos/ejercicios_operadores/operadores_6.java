package operadores_aritmeticos.ejercicios_operadores;

import java.util.Scanner;

public class operadores_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a , b;

        System.out.println("ingrese el valor de a: ");
        a = sc.nextDouble();
        System.out.println("ingrese el valor de b: ");
        b = sc.nextDouble();

       // Calculamos el cuadrado de la suma (a + b)^2
        double resultado = Math.pow(a + b, 2);
                System.out.println("el resultado es (a + b)^2 : " + resultado);





    }
}
