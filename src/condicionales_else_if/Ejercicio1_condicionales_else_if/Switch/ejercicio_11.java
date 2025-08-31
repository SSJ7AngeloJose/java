package condicionales_else_if.Ejercicio1_condicionales_else_if.Switch;

import javax.swing.*;

//. Ejercicio 11: Construir un programa que simule el
//funcionamiento de una calculadora que puede realizar las
//cuatro operaciones aritméticas básicas (suma, resta, producto
//y división) con valores numéricos enteros. El usuario debe
//especificar la operación con el primer carácter del primer
//parametro de la línea de comandos: S o s para la suma, R o r
//para la resta, P, p, M o m para el producto y D o d para la
//división.

public class ejercicio_11 {
    public static void main (String[] args){
        int num1, num2, suma, resta, mult, div;
        char operacion;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));

        operacion = JOptionPane.showInputDialog("ingrese la operacion a realizar (+, -, *, /): ").charAt(0);

        switch (operacion){
            case 's':
            case 'S': suma = num1 + num2;
            JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + suma);
            break;
            case 'r':
            case 'R': resta = num1 - num2;
            JOptionPane.showMessageDialog(null,"el resultado de la resta  es : " + resta);
            break;
            case 'p':
            case 'P':
            case 'm':
            case 'M': mult = num1 * num2;
            JOptionPane.showMessageDialog(null,"el resultado de la multiplicacion es: " + mult);
            break;
            case 'd':
            case 'D': div = num1 / num2;
            JOptionPane.showMessageDialog(null,"el resultado de la division es :" + div);
            break;
            default: JOptionPane.showMessageDialog(null,"la operacion no es valida");
        }
    }
}
