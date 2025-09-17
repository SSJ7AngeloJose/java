package arreglos.ejercicios;

import java.util.Scanner;

//leer 10 numeros enteros , guardarlos en un arreglo, debemos mostrarlos en el siguiente orden : el primero , el
// ultimo ,  el segundo , el penultimo , el tercero .
public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int inicio = 0;
        int fin = numeros.length - 1;


        System.out.println("guardando arreglos");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " 1digite los numeros: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Mostrando en orden: primero, último, segundo, penúltimo...");
        while (inicio <= fin) {
            if (inicio == fin) {
                System.out.println(numeros[inicio]);
            } else {
                System.out.println(numeros[inicio]);
                System.out.println(numeros[fin]);
            }
            inicio++;
            fin--;

        }
    }

}
