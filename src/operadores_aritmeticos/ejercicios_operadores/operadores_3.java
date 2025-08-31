package operadores_aritmeticos.ejercicios_operadores;

import java.util.Scanner;

public class operadores_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, resultado;

       System.out.println("digite la cantidad de dinero que tiene guillermo: ");
       guillermo = entrada.nextFloat();

        luis = guillermo/2;
        juan = (guillermo+luis)/2;

        resultado  = guillermo + luis + juan;
        System.out.println("la cantidad de dinero que tiene entre los 3 es : " + resultado);


    }
}
