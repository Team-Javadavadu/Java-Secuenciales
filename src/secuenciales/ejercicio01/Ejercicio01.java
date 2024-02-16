package secuenciales.ejercicio01;

// https://plataforma.josedomingo.org/pledin/cursos/programacion/curso/u16/
// Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String nombre;

        System.out.println("¿Como te llamas?");
        nombre = leer.next();

        System.out.printf("%nHola %s%n", nombre);
    }

}
