package secuenciales.ejercicio12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos
 * puntos en el plano. Calcula y muestra la distancia entre ellos. Formula:
 * raiz[(x2-x1)^2 + (y2-y1)^2]
 */
public class Ejercicio12 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        int x1, x2, y1, y2;
        float distancia;
        
        System.out.print("Ingrese punto x1 : ");
        x1 = Integer.parseInt(bufer.readLine());
        System.out.print("Ingrese punto y1 : ");
        y1 = Integer.parseInt(bufer.readLine());
        System.out.print("Ingrese punto x2 : ");
        x2 = Integer.parseInt(bufer.readLine());
        System.out.print("Ingrese punto y2 : ");
        y2 = Integer.parseInt(bufer.readLine());
        
        distancia = (float) Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        
        System.out.println("\nLa distancia entre los puntos es : " + distancia);

    }

}
