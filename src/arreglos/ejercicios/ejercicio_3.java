package arreglos.ejercicios;

import java.util.Scanner;

/// ejercicios 3 leer 5 numeros por teclado , almacenarlos en un arreglo y a continuacion realizar la media de los
/// numeros positivos , la media de los negativos y contar el numero de ceros.
///
public class ejercicio_3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        float numeros[] = new float[5];
        float suma_positivos=0, suma_negativos=0, media_positivos, media_negativos;
        int conteo_positivos=0, conteo_negativos=0, conteo_ceros=0;

        System.out.println("almacenando los datos");

        for (int i=0; i < 5; i++){
            System.out.println((i+1)+"digite un numero: ");
            numeros[i] = sc.nextFloat();

            if (numeros[i] == 0){
                conteo_ceros++;
            } else if (numeros[i] > 0) {
                suma_positivos += numeros[i];
                conteo_positivos++;
            }
            else{
                suma_negativos += numeros[i];
                conteo_negativos++;
            }

        }

        //media de los numeros positivos
        if (conteo_positivos == 0){
            System.out.println("no se puede sacar la media de los numeros positivos");
        }
        else{
            media_positivos = suma_positivos / conteo_positivos;
            System.out.println("la media de los numeros positivos es: "+ media_positivos);
        }
        //media numeros negativos
        if (conteo_negativos == 0){
            System.out.println("no se puede sacar la media de los numeros negativos");
        }
        else {
            media_negativos = suma_negativos / conteo_negativos;
            System.out.println("la media de los numeros negativos es " + media_negativos);
        }

        System.out.println("la cantidad de ceros es :" + conteo_ceros);

    }
}
