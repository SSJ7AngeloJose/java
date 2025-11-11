package arreglos;

import javax.swing.*;
import java.util.Scanner;

public class arreglos_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nelementos;

        nelementos  = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos del arreglo"));

        char[] letras = new char[nelementos];

        System.out.println("digite los elementos del arreglo");
        for (int i = 0; i < nelementos; i++){
            System.out.println((i+1) +"digite un caracter");
            letras[i] = sc.next().charAt(0);
        }

        System.out.println("lo caracteres del arreglo en total son: ");
        for (int i = 0; i < nelementos ; i++){
            System.out.println(letras[i] + " ");
        }


    }
}
