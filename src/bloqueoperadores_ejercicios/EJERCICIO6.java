package bloqueoperadores_ejercicios;

import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        //construir un programa que dado un numero total de oras , devuelve el numero de semanas hdias y horas, por ejemplo: dado un ottal de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas
        Scanner entrada= new Scanner(System.in);
        int horas , semanas, dias ;
        System.out.println("introdusca el numero total de horas. ");
        horas = entrada.nextInt();


        semanas = horas/(24 * 7);
        dias = horas % (24 * 7) / 24;




        System.out.println("El total de semanas es: " + semanas);
        System.out.println("El total de dias es: " + dias);
        System.out.println("El total de horas es: " + horas );
        entrada.close();



    }
}
