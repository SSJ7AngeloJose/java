package ciclos_while.ejercicios;

/*diseñar  un programa que muestre el producto de los 10 primeros numero*/
public class ejercicio_11 {
    public static void main(String[] args){
        long producto = 1;
       for (int i=1; i <= 20 ; i+=2) {
           producto = producto * i;
       }
        System.out.println("el producto de los 10 primeros numeros es: " + producto);



    }
}
