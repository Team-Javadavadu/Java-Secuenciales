package secuenciales.ejercicio14;

import java.util.Scanner;

/**
 * Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido. 
 * Ejemplo, si se introduce 23 que muestre 32.
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero;
        int resto, invertido = 0;
        
        System.out.print("Ingrese un numero entero positivo: ");
        numero = leer.nextInt();
        
        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }
        
        System.out.println("\nInvertido : " + invertido);
        
    }
    
}
