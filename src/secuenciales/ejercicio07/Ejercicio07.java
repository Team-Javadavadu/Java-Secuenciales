package secuenciales.ejercicio07;

// Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde. 
// Por ejemplo: 1000 minutos son 16 horas y 40 minutos.
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int minutos;
        int horas, resto;
        
        System.out.print("Ingrese minutos: ");
        minutos = leer.nextInt();
        
        horas = minutos / 60;
        resto = minutos % 60;
        
        System.out.println("\nHoras : " + horas);
        System.out.println("Minutos : " + resto);
        
    }
    
}
