package ejercicios;

import java.util.Scanner;

public class operadores_7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int totalhoras, semanas, dias, horas;
        System.out.println("Ingrese el numero de horas: ");
        totalhoras=sc.nextInt();

        semanas = totalhoras/168;
        dias = totalhoras%168/ 24;
        horas = totalhoras%24;


        System.out.println("El equivalente es :" );
        System.out.println("El total de semanas es: "+ semanas);
        System.out.println("El total de dias es: "+ dias);
        System.out.println("El total de horas es: "+ horas);

    }
}
