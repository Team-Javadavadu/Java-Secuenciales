package secuenciales.ejercicio16;

import java.util.Scanner;

/**
 * Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados
 * por una distancia d. El que está detrás viaja a una velocidad mayor. Se pide
 * hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) y
 * sus respectivas velocidades (km/h) y con esto determinar y mostrar en que
 * tiempo (minutos) alcanzará el vehículo más rápido al otro.
 */
public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        float v1, v2, d, t; // Velocidad 1 y 2, distancia y tiempo

        System.out.print("Dime la velocidad del coche 1 (kn/h): ");
        v1 = leer.nextFloat();
        System.out.print("Dime la velocidad del coche 2 (mas pequeña) (kn/h): ");
        v2 = leer.nextFloat();
        System.out.print("Dime la distancia entre lo coches: ");
        d = leer.nextFloat();

        t = d / (v1 - v2);
        t = t * 60;
        
        System.out.printf("%nLo alcanza en %s minutos%n", t);

    }

}
