package secuenciales.ejercicio04;

// Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        
        Scanner leer  = new Scanner(System.in);
        
        int num1, num2; // Entrada
        float suma, resta, mult, divi; // Salida
        
        System.out.print("Ingrere el primer número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrere el segundo número: ");
        num2 = leer.nextInt();
        
        // Proceso
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        divi = num1 / num2;
        
        System.out.println("\nLa suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + mult);
        System.out.println("La división es: " + divi);
        
    }
    
}
