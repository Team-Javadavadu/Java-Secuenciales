package secuenciales.ejercicio05;

// Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius. 
// Recordar que la fórmula para la conversión es: C = (F-32)*5/9
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        float F; // Entrada
        float C; // Salida

        System.out.print("Ingrese valor en grados Fahrenheit: ");
        F = leer.nextFloat();

        C = (F - 32) * 5 / 9;
        
        System.out.println("\nEn grados Celsius es " + C);

    }

}
