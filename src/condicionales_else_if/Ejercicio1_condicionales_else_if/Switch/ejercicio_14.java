package condicionales_else_if.Ejercicio1_condicionales_else_if.Switch;


import javax.swing.*;

/*
Ejercicio 14: Hacer un programa
que pase de Kg a otra unidad de
medida de masa, mostrar en
pantalla un menú con las
opciones posibles.
*/
public class ejercicio_14 {
    public static void main(String[] args){

        int opcion;
        double kg , gramos, libras;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido ingrese a las opciones para medir sus kg y pasar por " +
                "varias unidades/n"
        + "1. pasar a gramos"
        + "2. pasar a libras"
        + "3. salir"));

        switch (opcion){
            case 1:
                kg = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de kg a pasar a gramos"));
                gramos = kg * 1000;
                JOptionPane.showMessageDialog(null," la cantidad de gramos es de :" + gramos);
                break;
            case 2:
                kg = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de kg a pasar a libras"));
                libras = kg * 2.20462;
                JOptionPane.showMessageDialog(null," la cantidad de libras es de  : " + libras);
                break;
            case 3:
                JOptionPane.showInputDialog("estas seguro de salir?");
                JOptionPane.showMessageDialog(null,"gracias por usar el programa");
            case 4:
            default : JOptionPane.showMessageDialog(null,"la cantidad ingresada e/ la opcion no es valida");
        }










    }
}
