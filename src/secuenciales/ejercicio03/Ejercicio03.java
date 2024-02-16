package secuenciales.ejercicio03;

// Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        float cateto1, cateto2; // Entrada
        float hipotenusa; // Salida
        
        System.out.print("Ingrese primer cateto del triángulo: ");
        cateto1 = leer.nextFloat();
        System.out.print("Ingrese segundo cateto del triángulo: ");
        cateto2 = leer.nextFloat();
        
        // Proceso
        hipotenusa = (float) (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        System.out.println("La hipotenusa del triángulo es: " + Math.sqrt(hipotenusa));
        
    }
    
}
