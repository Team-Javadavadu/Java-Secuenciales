package secuenciales.ejercicio11;

import java.util.Scanner;

/**
 * Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su diferencia, 
 * de modo que el resultado sea siempre positivo)
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        float num1, num2;
        float distancia;
        
        System.out.print("Ingrese número 1: ");
        num1 = leer.nextFloat();
        System.out.print("Ingrese número 2: ");
        num2 = leer.nextFloat();
        
        distancia = Math.abs(num1 - num2);
        
        System.out.printf("\nLa distancia entre %s y %s es %s%n", num1, num2, distancia);
        
    }
    
}
