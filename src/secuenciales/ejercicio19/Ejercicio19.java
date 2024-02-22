package secuenciales.ejercicio19;

import java.util.Scanner;

/**
 * Escribir un algoritmo para calcular la nota final de un estudiante, considerando que: 
 * por cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int correctas, incorrectas, puntos;
        
        System.out.print("Ingrese cantidad de respuestas correctas: ");
        correctas = leer.nextInt();
        System.out.print("Ingrese cantidad de respuestas incorrectas: ");
        incorrectas = leer.nextInt();
        
        puntos = correctas * 5 + incorrectas * (-1);
        
        System.out.println("\nPuntos totales: " + puntos);
        
    }
    
}
