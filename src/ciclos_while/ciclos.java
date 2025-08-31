package ciclos_while;

import java.util.Scanner;

public class ciclos {
    public static void main(String[] args){
        //el while termina cuando la condicion es falsa
        Scanner sc = new Scanner(System.in);
        int i = 1, contador;
        System.out.println("digite cuantos numeros quieres en pantalla :");
        contador = sc.nextInt();

        while ( i <= contador ){
            System.out.println("el valor de i es : " + i);
            i+=2;
            /*  i++; - esto es para contar uno en uno */
            /* i+=2 ; - esto es paraq contar 2 en 2 */
        }
        sc.close();
    }
}
