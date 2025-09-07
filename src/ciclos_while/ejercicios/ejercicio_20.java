package ciclos_while.ejercicios;

import javax.swing.*;

public class ejercicio_20 {
    public static void main(String[] args){
        int num;
        float sueldo, maximo = 0;

        // Paso 1: Pedir el número N
        num = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos sueldos vas a ingresar?"));

        // Paso 2: Ingresar N sueldos
        for (int i = 1; i <= num; i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introduce el sueldo del empleado " + i + ": "));

            // Paso 3: Verificar si es el sueldo máximo
            if (sueldo > maximo){
                maximo = sueldo;
            }
        }

        // Paso 4: Mostrar el sueldo máximo
        JOptionPane.showMessageDialog(null, "El sueldo máximo es: " + maximo);
    }
}