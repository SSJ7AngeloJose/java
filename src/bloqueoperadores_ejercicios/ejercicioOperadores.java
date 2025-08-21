package bloqueoperadores_ejercicios;

import java.util.Scanner;

public class ejercicioOperadores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int horastrabajadas, pagohoras, resultado;
        System.out.print("cuantas horas trabajaste esta semana: ");
        horastrabajadas = entrada.nextInt();
        System.out.print("cuanto te pagan por hora: ");
        pagohoras = entrada.nextInt();
        resultado = horastrabajadas * pagohoras;
        System.out.println("Tu salario por semana o horas es : " + resultado);




        // /*
        //        Scanner sc = new Scanner(System.in);
        //       float cali1, cali2, promedio;
        //
        //        System.out.print("digite 2 calificaciones: ");
        //        cali1  = sc.nextFloat();
        //        cali2  = sc.nextFloat();
        //
        //        promedio = cali1 + cali2;
        //
        //        System.out.println("La calificacion es: " + promedio);
        //





}
}