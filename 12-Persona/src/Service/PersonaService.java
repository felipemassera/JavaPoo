/*
Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.

 */
package Service;

import Class.Persona;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class PersonaService {

    public Persona newPersona() {
        Scanner read = new Scanner(System.in);
        Persona p1 = new Persona();

        System.out.println("Ingrese Nombre ");
        p1.setName(read.next());
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Dia: ");
        int dia = read.nextInt();
        System.out.print("Mes: ");
        int mes = read.nextInt();
        System.out.print("Año: ");
        int anio = read.nextInt();

        LocalDate fecha = LocalDate.of(anio, mes, dia);
        p1.setFecha(fecha);

        return p1;
    }

    /**
     * Escribir un método calcularEdad() a partir de la fecha de nacimiento
     * ingresada. Tener en cuenta que para conocer la edad de la persona también
     * se debe conocer la fecha actual.
     */
    public int calcularEdad(Persona p1) {
        LocalDate fechaAct = LocalDate.now(); //fecha de ahora

        Period diff1 = Period.between(p1.getFecha(), fechaAct);

        System.out.println("age:" + diff1.getYears() + "years");
        int edad = diff1.getYears();
        return edad;
    }

    /**
     * • Agregar a la clase el método menorQue(int edad) que recibe como
     * parámetro otra edad y retorna true en caso de que el receptor tenga menor
     * edad que la persona que se recibe como parámetro, o false en caso
     * contrario.
     */
    public boolean lessThat(int edad, int newEdad) {

        return edad < newEdad;
    }

    /**
     * • Metodo mostrarPersona(): este método muestra la persona creada en el
     * método anterior.
     */
    public void mostrarPersona(Persona p1) {
        System.out.println(p1.toString());
                
    }
}
