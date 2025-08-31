package operadores_aritmeticos.ejercicios_operadores;

import java.util.Scanner;

public class operadores_4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        double salarioBase = 1000;
        double comisionPorCarro = 150;
        double porcentajeComision = 0.05; // 5%

        System.out.print("Ingrese el número de carros vendidos: ");
        int numeroCarros = sc.nextInt();

        System.out.print("Ingrese el valor total de ventas (en $): ");
        double totalVentas = sc.nextDouble();

        double salarioTotal = salarioBase +
                (numeroCarros * comisionPorCarro) +
                (porcentajeComision * totalVentas);

        System.out.println("El salario mensual del vendedor es: $" + salarioTotal);
    }
}
