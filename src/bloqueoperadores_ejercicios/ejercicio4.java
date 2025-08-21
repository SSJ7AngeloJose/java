package bloqueoperadores_ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion, primerexamenparcial,segundoexamenparcial, examenfinal , calificacionfinal;

        System.out.println("Ingrese la participacion del alumno: ");
        participacion = entrada.nextFloat();
        System.out.println("Ingrese la calificacion del primer examen parcial: ");
        primerexamenparcial = entrada.nextFloat();
        System.out.println("Ingrese la calificacion del segundo examen parcial: ");
        segundoexamenparcial = entrada.nextFloat();
        System.out.println("Ingrese la calificacion del examen final: ");
        examenfinal = entrada.nextFloat();

        // Calculo de la calificacion final
        calificacionfinal = (participacion * 0.10f) + (primerexamenparcial * 0.25f) + (segundoexamenparcial * 0.25f) + (examenfinal * 0.40f);
        // Imprimir la calificacion final



        System.out.println("La calificacion final del alumno es: " + calificacionfinal);

        if(calificacionfinal >= 12 && examenfinal <= 20) {
            System.out.println("el alumnos ha aprobado");
        } else   {
            System.out.println("el alumno ha reprobado");
        }

        System.out.println("Gracias por usar el programa");
        entrada.close();


    }
}
