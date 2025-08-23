package ejercicios;
import java.util.Scanner;

public class operadores_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salarioPorHora, horasTrabajadas, salarioSemanal;

        System.out.print("Ingrese el salario por hora: ");
        salarioPorHora = sc.nextFloat();

        System.out.print("Ingrese las horas trabajadas en la semana: ");
        horasTrabajadas = sc.nextFloat();

        salarioSemanal = salarioPorHora * horasTrabajadas;

        System.out.println("El salario semanal es: " + salarioSemanal);
    }
}

