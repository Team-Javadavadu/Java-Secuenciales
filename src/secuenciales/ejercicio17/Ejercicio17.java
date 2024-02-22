package secuenciales.ejercicio17;

import java.util.Scanner;

/**
 * Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos.
 * El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un
 * algoritmo que determine la hora de llegada a la ciudad B.
 */
public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        /**
         * hp: Hora de partida mp: Minuto de partida sp: Segundo de partida si:
         * Segundo inicial sf: Segundo final sv: Segundo viaje (tiempo que tarda
         * en segundos) hll: Hora de llegada mll: Minuto de llegada sll: Segundo
         * de llegada
         */
        int hp, mp, sp, si, sf, sv, hll, mll, sll;

        System.out.print("Hora de salida: ");
        hp = leer.nextInt();
        System.out.print("Minutos de salida: ");
        mp = leer.nextInt();
        System.out.print("Segundos de salida: ");
        sp = leer.nextInt();
        System.out.print("Tiempo que has tardado en segundos: ");
        sv = leer.nextInt();

        // Convertir hora de salida a segundos
        si = hp * 3600 + mp * 60 + sp;
        // Suma de segundos tardado
        sf = si + sv;
        // Convertir los segundos totales a hora, minuto y segundos
        hll = Math.toIntExact(sf / 3600);
        mll = Math.toIntExact((sf % 3600) / 60);
        sll = (sf % 3600) % 60;

        System.out.printf("%n%s:%s:%s%n", hll, mll, sll);

    }

}
