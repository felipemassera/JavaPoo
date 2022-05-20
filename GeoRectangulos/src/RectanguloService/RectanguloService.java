package RectanguloService;

import RectanguloClass.Rectangulo;
import java.util.Scanner;

public class RectanguloService {

    Scanner read = new Scanner(System.in);

    public Rectangulo crearRectangulo() {

        Rectangulo r1 = new Rectangulo();
        System.out.println("Modele su Rectangulo");
        System.out.println("Ingrese la base");
        r1.setBase(read.nextInt());
        System.out.println("Ingrese la altura");
        r1.setAltura(read.nextInt());
        return r1;
    }

    public void verRectangulo(Rectangulo r1) {
        int maxalt=r1.getAltura();
        int maxbas=r1.getBase();
        
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
          
                 System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    public void Superficie(Rectangulo r1) {
        System.out.println("La superficie del rectangulo es " + (r1.getBase() * r1.getAltura()));
    }

    public void Perimetro(Rectangulo r1) {
        System.out.println("El perimetro del rectangulo es " + ((r1.getBase() + r1.getAltura()) * 2));
    }
}
