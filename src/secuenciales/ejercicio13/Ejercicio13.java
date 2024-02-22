package secuenciales.ejercicio13;

import java.util.Scanner;

/**
 * Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero;
        float raiz_2, raiz_3;
        
        System.out.print("Ingrese un numero entero: ");
        numero = leer.nextInt();
        
        raiz_2 = (float) Math.sqrt(numero);
        raiz_3 = (float) Math.cbrt(numero);
        
        System.out.println("\nRaiz cuadrada: " + raiz_2);
        System.out.println("Raiz cúbica: " + raiz_3);
        
    }
    
}
