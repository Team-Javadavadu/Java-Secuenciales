package secuenciales.ejercicio20;

import java.util.Scanner;

/**
 * Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos)
 * después de pedirnos cuantas monedas tenemos (de 2€, 1€, 50 céntimos, 20
 * céntimos o 10 céntimos).
 */
public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int euros2, euro1, cent50, cent20, cent10, te, tc; // te = total euros, tc = total centimos
        int tte, ttc;
        
        System.out.print("Monedas de 2 euros: ");
        euros2 = leer.nextInt();
        System.out.print("Monedas de 1 euro: ");
        euro1 = leer.nextInt();
        System.out.print("Monedas de 50 centimos: ");
        cent50 = leer.nextInt();
        System.out.print("Monedas de 20 centimos: ");
        cent20 = leer.nextInt();
        System.out.print("Monedas de 10 centimos: ");
        cent10 = leer.nextInt();
        
        te = euros2 * 2 + euro1;
        tc = cent50 * 50 + cent20 * 20 + cent10 * 10;
        
        tte = te + Math.toIntExact(tc / 100);
        ttc = tc % 100;
        
        System.out.printf("%n%s euros y %s centimos %n", tte, ttc);
        
    }
    
}
