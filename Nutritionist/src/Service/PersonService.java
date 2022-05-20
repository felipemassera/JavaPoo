/*
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 */
package Service;

import Class.PersonClass;
import java.util.Scanner;

public class PersonService {

    Scanner read = new Scanner(System.in);

    public PersonClass newPerson() {
        PersonClass it = new PersonClass();

        System.out.println(" Insert Name");
        it.setName(read.next());
        System.out.println(" Insert Age");
        it.setAge(read.nextInt());
        
        do {
            System.out.println("indicate your gender");
            System.out.print("'M' Male" + "\n"
                    + "'F' Female" + "\n"
                    + "'O' Other" + "\n"
                    + "gender: ");
            it.setSex(read.next().toUpperCase());

            if (!it.getSex().equals("M") && !it.getSex().equals("F") && !it.getSex().equals("O")) {
                System.out.println("'" + it.getSex() + "' Its no aviable answer");
            }
        } while (!it.getSex().equals("M") && !it.getSex().equals("F") && !it.getSex().equals("O"));

        System.out.println("insert Height");
        it.setHeight(read.nextDouble());
        System.out.println("insert Weight");
        it.setWeight(read.nextDouble());
        return it;
    }

    /**
     * • Método calcularIMC(): calculara si la persona está en su peso ideal
     * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor
     * menor que 20, significa que la persona está por debajo de su peso ideal y
     * la función devuelve un -1. Si la fórmula da por resultado un número entre
     * 20 y 25 (incluidos), significa que la persona está en su peso ideal y la
     * función devuelve un 0. Finalmente, si el resultado de la fórmula es un
     * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
     * devuelve un 1.
     */
    public int IMC(PersonClass it) {
        double rta = (it.getWeight() / (Math.pow(it.getHeight(), 2)));

        if (rta < 20) {
            return -1;
        } else if (rta >= 20 && rta < 25) {
            return 0;
        } else{
            return 1;
        }
        
    }

//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean legacyAge(PersonClass it) {

        return (it.getAge() >= 18);
    }
}
