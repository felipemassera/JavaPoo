package Services;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {

    Scanner read = new Scanner(System.in);

    public Circunferencia CrearCircunferencia() {
        Circunferencia c1 = new Circunferencia();

        System.out.println("Ingrese el radio");
        c1.setRadio(read.nextFloat());

        return c1;
    }

    public void Areacircunf(Circunferencia c1) {

        double radio = c1.getRadio();

        System.out.println("El valor del area es: " + (3.14 * radio * radio));
    }

    public void perimetrocircunf(Circunferencia c1) {
        System.out.println("El perimetro es: " + (2 * 3.14 * c1.getRadio()));
    }

}
