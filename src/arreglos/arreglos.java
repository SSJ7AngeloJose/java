package arreglos;

public class arreglos {
    public static void main(String[] args) {
        int[] numero  = {10,20,30};

        //opcion 1 de inicializar un arreglo
        //int[] numero = new int[3];
        //  numero[0] = 10;
        //  numero[1] = 20;
        //  numero[2] = 30;

        //opcion 2 de inicializar un arreglo
        //int[] numero = {10,20,30};

        for (int i = 0; i < 3; i++){
            System.out.println("Elemento en el indice " + i + ": " + numero[i]);
        }
    }
}