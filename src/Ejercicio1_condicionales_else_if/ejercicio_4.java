package Ejercicio1_condicionales_else_if;

import javax.swing.*;

public class ejercicio_4 {
    public static void main(String[] args) {
        double montoCompra;
        double totalPagar;

        montoCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de su compra:"));

        if (montoCompra > 300) {
            totalPagar = montoCompra * 0.80; // Aplica 20% de descuento
            JOptionPane.showMessageDialog(null, "¡Felicidades! Se aplicó un 20% de descuento.\nTotal a pagar: $" + totalPagar);
        } else {
            JOptionPane.showMessageDialog(null, "No aplica descuento. Total a pagar: $" + montoCompra);
        }
    }
}