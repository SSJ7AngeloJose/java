package bloqueoperadores_ejercicios;



//Luis tiene la mitad de lo que posee Guillermo.
//Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
//Hacer un programa que calcule e imprima la cantidad de dinero que tienen los 3

import java.util.Scanner;

//tienen entre los tres. */
public class ejerciciosoperadores2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float Luis, Guillermo, Juan, total;
        System.out.println("digite la cantidad de dinero que posee Guillermo: ");
        Guillermo = entrada.nextFloat();

        Luis = Guillermo/2;
        Juan = (Luis + Guillermo)/2;

        total = Luis + Guillermo + Juan ;

        System.out.println("la cantidad de dinero que posseen  entre los 3 es : " +  total);

    }
}
