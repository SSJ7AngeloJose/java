package arreglos.ejercicios;

import java.util.Scanner;

//leer 5 numeros guardarlos en un arreglo y mostrarlos en el
//orden inverso al introducido
public class ejercicio_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float[] numeros = new float[5];

        System.out.println("guardando los datos en el arreglo");


        for (int i=4; i >= 0 ; i--){
            System.out.print("leer 5 numeros: " + (i + 1) + ": ");
            numeros[i] = sc.nextFloat();
        }

        System.out.println("los resultados son : ");
        for (float i: numeros){
            System.out.println(i);
        }


    }
}
