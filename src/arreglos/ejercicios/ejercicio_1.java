package arreglos.ejercicios;

import java.util.Scanner;

//leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido
public class ejercicio_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float[] numeros = new float[5];

       // float numero [] = new float[2];
        System.out.println("guardando los datos en el arreglo");

        for (int i=0; i<5 ; i++){
            System.out.print((i+1)+ "digite un numero");
            numeros[i] = sc.nextFloat();
        }

        System.out.println("imprimir los elementos del arreglo");
        for (float i: numeros){
            System.out.println(i);
        }


    }
}
