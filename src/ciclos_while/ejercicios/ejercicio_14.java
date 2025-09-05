package ciclos_while.ejercicios;


import javax.swing.*;

//pedir 10 sueldos mostrar su suma y cuantos hay mayores a 1000$
public class ejercicio_14 {
    public static void main(String[] args){
        double sueldo, sumaSueldo = 0;
        int contSueldo = 0;
        for(int i = 1; i <= 10; i++){
            sueldo = Double.parseDouble(JOptionPane.showInputDialog("ingrese su sueldo: "));
            sumaSueldo += sueldo;
            if (sueldo > 1000){
                contSueldo++;
            }
        }
        System.out.println("la suma de los suledos es: " + sumaSueldo + " y la cantidad de sueldos mayores a 1000$ es: " + contSueldo);

    }
}
