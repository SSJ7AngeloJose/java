package ciclos_while.ejercicios;

import javax.swing.*;

//Ejercicio 17: Una empresa que se dedica a la venta
//de desinfectantes necesita un programa para
//gestionar las facturas. En cada factura figura: el
//código del artículo, la cantidad vendida en litros y el
//precio por litro. Se pide de 5 facturas introducidas:
//Facturación total, cantidad en litros vendidos del
//artículo 1 y cuantas facturas se emitieron de más de
//$600.

public class ejercicio_17 {
    public static void main(String[] args){
        int codarticulo, litros, listrosarticulo1=0,conteoMas600=0;
        float preciolitor ,importefactura, facturaciontotal=0;

        for (int i = 1; i <= 5; i++){
            codarticulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del articulo " + i + ":"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los litros vendidos del articulo " + i + ":"));
            preciolitor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio por litro del articulo " + i + ":"));

            importefactura = (float) litros * preciolitor;
            facturaciontotal += importefactura;

            if (codarticulo == 1){
                listrosarticulo1 += litros;
            }
            if (importefactura > 600){
                conteoMas600++;
            }

        }
        System.out.println("---RESULTADOS---");
        System.out.println("El total facturado en el mes es: " + facturaciontotal);
        System.out.println("La cantidad de litros vendidos del articulo 1 es: " + listrosarticulo1);
        System.out.println("La cantidad de articulos que superaron los $600 de factura es: " + conteoMas600);



    }
}
