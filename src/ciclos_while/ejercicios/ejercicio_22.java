package ciclos_while.ejercicios;

import javax.swing.*;


//pedir 5 califaciones de alumnos y decir al final si hay algun suspenso

public class ejercicio_22 {
    public static void main(String[] args){
        int num , califaciones= 0, suma=0, suspensos=0;

        num = Integer.parseInt(JOptionPane.showInputDialog("cuantas calificaciones vas a introducir?"));
        for(int i=1; i<=num ; i++){
            califaciones = Integer.parseInt(JOptionPane.showInputDialog("introduce la calificacion : " + i));
            suma = suma + califaciones;
        }
        if (califaciones < 5){
            suspensos++;
        }
        System.out.println("la media de las calificaciones es: " + (suma/num));
        System.out.println("el numero de suspensos es: " + suspensos);
    }
}
