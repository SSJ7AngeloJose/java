package operadores_aritmeticos;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float num1 ,num2,suma,resta,mult,div,resto;

        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        resto = num1 % num2;

        System.out.println("el resultado de la suma es: " +  suma);
        System.out.println("el resultado de la resta es: " + resta);
        System.out.println("el resultado de la mult es: " +  mult);
        System.out.println("el resultado de la div es: " +  div);
        System.out.println("el resultado de la resto es: " +  resto);



    }
}
