package secuenciales.ejercicio06;

// Calcular la media de tres números pedidos por teclado.

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n1, n2 ,n3; // Entrada
        int media; // Salida
        
        System.out.print("Ingrese primer número: ");
        n1 = leer.nextInt();
        System.out.print("Ingrese segundo número: ");
        n2 = leer.nextInt();
        System.out.print("Ingrese tercer número: ");
        n3 = leer.nextInt();
        
        // Proceso
        media = (n1 + n2 + n3) / 3;
        
        System.out.println("\nLa media es " + media);
        
    }
    
}
