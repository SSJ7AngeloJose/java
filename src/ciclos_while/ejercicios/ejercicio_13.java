package ciclos_while.ejercicios;

/*pedir 10 numeros mostrar la media de los numeros positivos , la media de los numeros negativos y la cantidad de
ceros*/
public class ejercicio_13 {
    public static void main(String[] args) {
        int num, sumaPos = 0, contPos = 0, sumaNeg = 0, contNeg = 0, contCeros = 0;
        float mediaPos, mediaNeg;

        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese un numero: "));
            if (num == 0) {
                contCeros++;
            } else if (num > 0) { //si el numero es positivo
                sumaPos += num;
                contPos++;
            } else {
                sumaNeg += num; //si el numero es negativo
                contNeg++;
            }
        }
        //tratamos con los positivos
        if (contPos == 0) {
            System.out.println("No se ingresaron numeros positivos");
        } else {
            mediaPos = (float) sumaPos / contPos;
            System.out.println("La media de los numeros positivos es: " + mediaPos);
        }
        //tratamos con los negativos
        if (contNeg == 0) {
            System.out.println("no se ingresaron numeros negativos");
        } else {
            mediaNeg = (float) sumaNeg / contNeg;
            System.out.println("La media de los numeros negativos es: " + mediaNeg);
        }

        System.out.println("La cantidad de ceros es: " + contCeros);

    }
}