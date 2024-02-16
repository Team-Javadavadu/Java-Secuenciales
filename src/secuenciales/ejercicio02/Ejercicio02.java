package secuenciales.ejercicio02;

// Calcular el perímetro y área de un rectángulo dada su base y su altura.
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        float base, altura; // Entrada
        float perimetro, area; // Salida

        System.out.print("Ingrese la base del rectángulo: ");
        base = leer.nextFloat();
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = leer.nextFloat();
        
        // Proceso
        area = base * altura;
        perimetro = 2 * (base + altura);
        
        System.out.println("\nEl perímetro del rectángulo es: " + perimetro);
        System.out.println("El area del rectángulo es: " + area);

    }

}
