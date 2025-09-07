package ciclos_while.ejercicios;

import javax.swing.*;

public class ejercicio_19
{
    public static void main(String[] args){
        float nota;
        int aprobados = 0, condicionados = 0, suspensos = 0;

        for (int i =1; i <=10 ; i++){
            do{
               nota  = Float.parseFloat(JOptionPane.showInputDialog(("Introduce la nota del alumno " + i + ": ")));
            }while(nota < 0 || nota > 10);
            if (nota == 4){
                condicionados++;
            } else if (nota >= 5){
                aprobados++;
            } else {
                suspensos++;
            }

        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Condicionados: " + condicionados);
        System.out.println("Suspensos: " + suspensos);

    }
}
