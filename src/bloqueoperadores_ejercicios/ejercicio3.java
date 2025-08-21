package bloqueoperadores_ejercicios;

import java.util.Scanner;

//· Ejercicio 4: Una compañía de venta de carros
//usados, paga a su personal de ventas un salario
//de $1000 mensuales, mas una comisión de
//$150 por cada carro vendido, más el 5% del
//valor de la venta por carro. Cada mes el
//capturista de la empresa ingresa en la
//computadora los datos pertinentes. Hacer un
//programa que calcule e imprima el salario
//mensual de un vendedor dado.

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float salariobase = 1000 , comision, carrosVendidos ,comisionPorcentaje, valorventa, salariototal;

        System.out.println("Ingrese la cantidad de carros vendidos: ");
        carrosVendidos = entrada.nextFloat();

        System.out.print("ingrese el valor total de ventas por cada carro: ");
        valorventa = entrada.nextFloat();

        comision = 150 * carrosVendidos ;
        comisionPorcentaje = valorventa * 0.05f; // 5% del valor total de ventas
        salariototal = salariobase + comision + comisionPorcentaje;

        System.out.println("el valor total venta es : " + salariototal);

    }
}
