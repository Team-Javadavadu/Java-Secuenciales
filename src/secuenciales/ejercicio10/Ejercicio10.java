package secuenciales.ejercicio10;

import java.util.Scanner;

/**
 * Un alumno desea saber cual será su calificación final en la materia de Algoritmos. 
 * Dicha calificación se compone de los siguientes porcentajes:
    55% del promedio de sus tres calificaciones parciales.
    30% de la calificación del examen final.
    15% de la calificación de un trabajo final.
 */

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Entrada
        int cp1, cp2, cp3; // Calificaciones parciales
        int ef, tf; // Examen final y trabajo grupal
        float pcp, cef, ctf, cf; // Promedio de calif. parcial, califi. examen final, calif. trabajo final y calif. final
        
        System.out.print("Ingrese calificacion parcial 1: ");
        cp1 = leer.nextInt();
        System.out.print("Ingrese calificacion parcial 2: ");
        cp2 = leer.nextInt();
        System.out.print("Ingrese calificacion parcial 3: ");
        cp3 = leer.nextInt();
        System.out.print("Ingrese nota de examen final: ");
        ef = leer.nextInt();
        System.out.print("Ingrese nota de trabajo final: ");
        tf = leer.nextInt();
        
        pcp = (float) (0.55 * ((cp1 + cp2 + cp3) / 3));
        cef = (float) (0.3 * ef);
        ctf = (float) (0.15 * tf);
        cf = pcp + cef + ctf;
        
        System.out.println("Calificacion final: " + cf);
    }
    
}
