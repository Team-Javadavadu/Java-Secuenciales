package secuenciales.ejercicio08;

// Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, 
// el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes 
// y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        float s_base;
        float comisiones, neto;
        
        System.out.print("Ingrese sueldo base: ");
        s_base = leer.nextFloat();
        
        comisiones = (float) (s_base * 0.10);
        neto = s_base + comisiones;
        
        System.out.println("\nComisiones: " + comisiones);        
        System.out.println("Sueldo neto: " + neto);        
        
    }
    
}
