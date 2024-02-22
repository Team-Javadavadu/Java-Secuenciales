package secuenciales.ejercicio18;

import java.util.Scanner;

/**
 * Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre, paterno, materno, inicial;
        
        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.print("Ingrese su apellido paterno: ");
        paterno = leer.nextLine();
        System.out.print("Ingrese su apellido materno: ");
        materno = leer.nextLine();
        
        inicial = nombre.substring(0,1);
        inicial += paterno.substring(0,1);
        inicial += materno.substring(0,1);
        
        System.out.println("\nIniciales: " + inicial);
        
    }
    
}
