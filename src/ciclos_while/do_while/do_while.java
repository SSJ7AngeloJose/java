package ciclos_while.do_while;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args){

        /*el do while solo se ejecuta una vez, aunque la condicion sea falsa -
        *
        int i = 11;
        do{
            System.out.println(i);
            i++;
        }
        while (i <= 10);

        */
        Scanner sc = new Scanner(System.in);
        int i=1 , contador;
        System.out.println("digite cuantos numeros quieres en pantalla :");
        contador = sc.nextInt();
        do{
            System.out.println(i);
            i++;
            /*   i+=3;   i+=3; - esto es paraq contar 3 en 3 */
        }
        while (i <=  contador);


    }
}
