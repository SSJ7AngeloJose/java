package ciclos_while.ejercicios;

/*·
Ejercicio 5: Realizar un juego para adivinar un
número. Para ello generar un número aleatorio
entre 0-100, y luego ir pidiendo números
indicando "es mayor" o "es menor" según sea
mayor o menor con respecto a N. El proceso
termina cuando el usuario acierta y mostrar el
número de intentos.
*/

import javax.swing.*;

public class ejercicio_5 {
    public static void main(String[] args){
        int num, aleatorio ,contador = 0;
        aleatorio = (int)(Math.random()*100);

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero entre 0 y 100"));
            if (aleatorio > num) {
                System.out.println("Es mayor");
            } else {
                System.out.println("Es menor");
            }
            contador++;
        }while (num != aleatorio);
        System.out.println("Felicidades, has adivinado el numero " + contador + " intentos");



    }
}
