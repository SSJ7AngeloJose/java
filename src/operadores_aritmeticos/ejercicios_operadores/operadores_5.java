package operadores_aritmeticos.ejercicios_operadores;

import java.util.Scanner;

public class operadores_5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float participacion , califacion1 , calificacion2 , examenfinal , notafinal;

        System.out.print("ingrese la nota de participacion del estudiante : ");
        participacion = entrada.nextFloat();
        System.out.print("ingrese la 1 nota parcial  del estudiante : ");
        califacion1 = entrada.nextFloat();
        System.out.print("ingrese la 2 nota parcial  del estudiante : ");
        calificacion2 = entrada.nextFloat();
        System.out.print("ingrese la nota del exame final: ");
        examenfinal = entrada.nextFloat();


        participacion *= 0.10f;  califacion1 *= 0.25f; calificacion2 *= 0.25f; examenfinal *= 0.40f;

        notafinal = participacion + califacion1 + calificacion2 + examenfinal ;


        System.out.println("la nota final del estudiante es: " + notafinal );




    }
}
