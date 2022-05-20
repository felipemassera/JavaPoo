package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota { //este servicio sirve para crear una mascota nueva con los parametros nombre,apodo y tipo precargado. 
// supuestamente al hacer esto declaramos el SCANNER global

    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //El <.useDelimiter("\n")> se usa para que al poner un espacio enuna cadena de caracteres no te salte una peticion 

    public Mascota CrearMascota() {
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir Apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();

        return new Mascota(nombre, apodo, tipo);// de esta forma devuelvo una nueva mascota con los parametros ya precargados por teclado

    }
}
