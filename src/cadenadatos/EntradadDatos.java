package cadenadatos;

import java.util.Scanner;

public class EntradadDatos {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
      double numero;

      System.out.println("ingrese un numero decimal: ");
      numero = datos.nextDouble();
      System.out.println("el numero ingresado es : " + numero);

    }

}
