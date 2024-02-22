package secuenciales.ejercicio15;

import java.util.Scanner;

/**
 * Dadas dos variables numéricas A y B, que el usuario debe teclear, 
 * se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int A, B, aux;
        
        System.out.print("Ingrese valor de la variable A: ");
        A = leer.nextInt();
        System.out.print("Ingrese valor de la variable B: ");
        B = leer.nextInt();
        
        aux = A;
        A = B;
        B = aux;
        
        System.out.println("\nNuevo valor de A: " + A);
        System.out.println("Nuevo valor de B: " + B);
        
    }
    
}
