package main;

import Class.Persona;
import Service.PersonaService;
import java.util.Scanner;

public class PersonaMain {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        PersonaService ps = new PersonaService();

        Persona p1 = ps.newPersona();

        int edad = ps.calcularEdad(p1);
        System.out.println("Ingrese la edad de comparacion (< = TRUE)");
        int edad2 = read.nextInt();
        System.out.println(ps.lessThat(edad, edad2));
        ps.mostrarPersona(p1);
    }

}
