package secuenciales.ejercicio09;

// Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuanto deberá pagar finalmente por su compra.

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        float t_compras;
        float t_pagar;
        
        System.out.print("Ingrese total compra: ");
        t_compras = leer.nextFloat();
        
        t_pagar = (float) (t_compras - (t_compras * 0.15));
        
        System.out.println("\nTotal a pagar: " + t_pagar);
        
    }
    
}
