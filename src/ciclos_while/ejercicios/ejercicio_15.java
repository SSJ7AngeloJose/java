package ciclos_while.ejercicios;

import javax.swing.*;

public class ejercicio_15 {
    public static void main(String[] args) {
        int edad, sumaEdad = 0, contmayores18 = 0, contadormayor175 = 0;
        float altura, sumaAltura = 0, mediaEdad, mediaAltura;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("alumno " + i + " ingrese su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("alumno " + i + " ingrese su altura en metros: "));
            sumaEdad += edad;
            sumaAltura += altura;
            if (edad >= 18) {
                contmayores18++;
            }
            if (altura > 1.75) {
                contadormayor175++;
            }
        }
        mediaEdad = (float)  sumaEdad / 5;
        mediaAltura =    sumaAltura / 5;

        System.out.println("la media de edad es: " + mediaEdad + " años");
        System.out.println("la media de altura es: " + mediaAltura + " metros");
        System.out.println("la cantidad de alumnos mayores a 18 años es: " + contmayores18);
        System.out.println("la cantidad de alumnos mayores a 1.75 metros es: " + contadormayor175);


    }

}
