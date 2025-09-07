package ciclos_while.ejercicios;

import javax.swing.*;

//hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro solo existen
// tres productos con precios : 1- 0,6$/litro , 2- 3$/litro , 3- 1,25$/litro
public class ejercicio_18 {
    public static void main(String[] args){
        int codarticulo, litros, listrosarticulo1=0,conteoMas600=0;
        float preciolitor ,importefactura, facturaciontotal=0;

        for (int i = 1; i <= 5; i++){
            codarticulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del articulo " + i + ":"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los litros vendidos del articulo " + i + ":"));
            preciolitor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio por litro del articulo " + i + ":"));

            switch (codarticulo) {
                case 1:
                    preciolitor = 0.6f;
                    break;
                case 2:
                    preciolitor = 3.0f;
                    break;
                case 3:
                    preciolitor = 1.25f;
                    break;
                default:
                    System.out.println("Codigo de articulo no valido");
                    continue; // Salta a la siguiente iteración del bucle


            }

        }

    }}



