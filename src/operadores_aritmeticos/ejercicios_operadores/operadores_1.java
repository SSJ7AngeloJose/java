package operadores_aritmeticos.ejercicios_operadores;

import java.util.Scanner;

public class operadores_1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int cali1, cali2, cali3,resultado;

        System.out.println("Ingrese 3 calificaciones: ");
        cali1= entrada.nextInt();
        cali2= entrada.nextInt();
        cali3= entrada.nextInt();

        resultado = cali1 + cali2 + cali3;
        System.out.println("el resultado de las tres califacion es: "+ resultado);
    }
}
