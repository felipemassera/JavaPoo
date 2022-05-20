/*
Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos
 */
package PuntosService;

import Class.Puntos;
import java.util.Scanner;

public class PuntosService {

    Scanner read = new Scanner(System.in);

    public Puntos crearPuntos() {
        Puntos p1 = new Puntos();
        System.out.println("Ingrese el valor de x1");
        p1.setX1(read.nextInt());
        System.out.println("Ingrese el valor de y1");
        p1.setY1(read.nextInt());
        System.out.println("Ingrese el valor de x2");
        p1.setX2(read.nextInt());
        System.out.println("Ingrese el valor de Y2");
        p1.setY2(read.nextInt());

        return p1;
    }

    public double calculator(Puntos p1) { // Raiz((x2-x1)^2 +(y2-y1)^2)
        int resX = p1.getX2() - p1.getX1();
        int resY = p1.getY2() - p1.getY1();

        double dif = Math.sqrt(Math.pow(resX, 2) + Math.pow(resY, 2));

        return dif;
    }

}
