package condicionales_else_if.Ejercicio1_condicionales_else_if.Switch;

/*. Ejercicio 13: Hacer un programa que simule un
cajero automático con un saldo inicial de 1000
Dólares, con el siguiente menú de opciones:

1. Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta
3. Salir
        */


import javax.swing.*;

public class ejercicio_13 {
    public static void main(String[] args){
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso,saldoactual, retiro;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico/n"
        + "1. ingreesar dinero en la cuenta"  /*concatenacion*/
        + "2. retirar dinero de la cuenta"
        + "3. salir"));

        switch (opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("ingrese la cantidad a ingresar"));
             saldoactual = saldo_inicial + ingreso;
             JOptionPane.showMessageDialog(null,"su saldo actual es de : " + saldoactual);
             break;
            case 2:retiro = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad a retirar"));
            if (retiro > saldo_inicial){
                JOptionPane.showMessageDialog(null,"no cunet acon el saldo suficiente para este retiro");
            } else {
                saldoactual = saldo_inicial - retiro;
                JOptionPane.showMessageDialog(null,"su saldo actual es de : " + saldoactual);
            }
            break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null,"error transsacion no encontrada");
        }






    }
}
