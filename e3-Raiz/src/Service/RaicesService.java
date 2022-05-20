package Service;

import Class.Raices;
import java.util.Scanner;

public class RaicesService {

    Scanner read = new Scanner(System.in);

    /**
     * creacion de objero raiz
     *
     * @return r1
     */
    public Raices newRaiz() {

        Raices r1 = new Raices();

        System.out.println("Ingrese valor a A: ");
        r1.setA(read.nextDouble());
        System.out.println("Ingrese valor a B: ");
        r1.setB(read.nextDouble());
        System.out.println("Ingrese valor a C: ");
        r1.setC(read.nextDouble());

        return r1;
    }

    /**
     * • Método getDiscriminante(): devuelve el valor del discriminante
     * (double). El discriminante tiene la siguiente formula: (b^2)-4*a*c
     */
    public double getDiscriminante(Raices r1) {

        double discriminante = (Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC());

        return discriminante;
    }

    /**
     * Método tieneRaices(): devuelve un booleano indicando si tiene dos
     * soluciones, para que esto ocurra, el discriminante debe ser mayor o igual
     * que 0.
     */
    public boolean tieneRaices(double x) {
        return x >= 0;
    }

    /**
     * Método tieneRaiz(): devuelve un booleano indicando si tiene una única
     * solución, para que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz(double x) {
        return x == 0;
    }

    /**
     * Método obtenerRaices(): llama a tieneRaices() y si devolvió true, imprime
     * las 2 posibles soluciones.
     */
    public void obtenerRaices(Raices r1, double x) {

        if (tieneRaices(x)) {
            double j = ((-r1.getB() + Math.sqrt((Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC()))) / 2 * r1.getA());
            double k = ((-r1.getB() - Math.sqrt((Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC()))) / 2 * r1.getA());
            System.out.println("Raiz 1 " + j);
            System.out.println("Raiz 2 " + k);
        }
    }

    /**
     * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una
     * única raíz. Es en el caso en que se tenga una única solución posible.
     */
    public void obtenerRaiz(Raices r1, double x) {
        if (tieneRaiz(x)) {
            double j = ((-r1.getB() + Math.sqrt((Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC()))) / 2 * r1.getA());
            double k = ((-r1.getB() - Math.sqrt((Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC()))) / 2 * r1.getA());
            if (j >= 1) {
                System.out.println(j);
            } else if (k >= 1) {
                System.out.println(k);
            }
        }
    }

    /* Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
caso de no existir solución, se mostrará un mensaje.
    
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo 
delante de -b
     */
    public void calcular(Raices r1, double x) {
        if (x >= 0) {
            obtenerRaices(r1, x);
            obtenerRaiz(r1, x);

        } else {
            System.out.println("ERROR no tiene raices");
        }
    }
}
