package operadores;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero1,numero2, suma, resta, mult, div;

        System.out.println("digite 2 numeros : ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La suma de los numeros es: " + div);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + mult);





    }
}
