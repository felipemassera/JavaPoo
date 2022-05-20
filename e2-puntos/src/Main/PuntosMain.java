/*
 Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos
 */
package Main;

import Class.Puntos;
import PuntosService.PuntosService;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class PuntosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntosService ps = new PuntosService();
        Scanner read = new Scanner(System.in);

        Puntos p1 = ps.crearPuntos();

        System.out.println(ps.calculator(p1));

    }

}
