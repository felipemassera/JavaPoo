package Service;

import Class.CoffeeMaker;
import java.util.Scanner;

public class CoffeeMakerService {

    Scanner read = new Scanner(System.in);

    public CoffeeMaker Nespresso() {

        CoffeeMaker c1 = new CoffeeMaker();
        c1.setMaxCapacity(1000); // Max charge
        c1.setCapActually(0); // capacity initial

        return c1;
    }

//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    public CoffeeMaker Charge(CoffeeMaker c1) {
        if (c1.getCapActually() >= 500) {
            System.out.println("No needed charge, Nesspresso charge: " + c1.getCapActually()+" ml");
        } else {
            c1.setCapActually(c1.getMaxCapacity());
            System.out.println("Maximum load : " + c1.getCapActually()+" ml");
        }
        return c1;
    }

//Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public CoffeeMaker Empty(CoffeeMaker c1) {
        c1.setCapActually(0);
        System.out.println("Emty, Nesspresso charge: " + c1.getCapActually() + " ml");
        return c1;
    }

    /**
     * Método agregarCafe(int): se le pide al usuario una cantidad de café, el
     * método lo recibe y se añade a la cafetera la cantidad de café indicada.
     * DEVUELVE BOOLEAN
     */
    public boolean ChargeCoffee(CoffeeMaker c1, boolean ok) {

        System.out.println("Insert how cooffe charge (mg)");
        int coffee = read.nextInt();
        if (coffee == 0) {
            System.out.println("you dont charge any coffee");
            ok = false;
        } else if (coffee > 0 && coffee < 100) {
            System.out.println("Coffee charged!");
            ok = true;
        } else {
            System.out.println("too much coffee");
            ok = false;
        }

        return ok;
    }

    /**
     * • Método servirTaza(int): se pide el tamaño de una taza vacía, el método
     * recibe el tamaño de la taza y simula la acción de servir la taza con la
     * capacidad indicada. Si la cantidad actual de café “no alcanza” para
     * llenar la taza, se sirve lo que quede. El método le informará al usuario
     * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la
     * taza.
     */
    public CoffeeMaker fillCup(CoffeeMaker c1, int cup) {

        if (cup > c1.getCapActually()) {
            System.out.println("Doesn't fill up completely");
            cup = c1.getCapActually();
            System.out.println("Cup : " + cup + " ml");
            c1.setCapActually(0);
            System.out.println("Nesspresso charge: " + c1.getCapActually() + " ml");
        } else {
            c1.setCapActually(c1.getCapActually() - cup);
            System.out.println("Cup : " + cup + " ml");
            System.out.println("Nesspresso charge: " + c1.getCapActually() + " ml");
        }
        return c1;
    }

}
