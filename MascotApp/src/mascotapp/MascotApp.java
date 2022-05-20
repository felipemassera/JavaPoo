package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

public class MascotApp {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /**
         * De esta forma creamos una mascota utilizando los moldes de ENTIDADES
         */
        Mascota m1 = new Mascota("Fernando Chiquito", leer.next(), "Perro"); //el espacio que ingresa por teclado es del apodo. 

        m1.setNombre("pepe chiquillo");
        System.out.println(m1.getNombre());
        System.out.println(m1); //Mensaje del TOSTRING del objeto m1
        m1.pasear(100); //sacamos a pasear al perro
        System.out.println(m1); //Mensaje del TOSTRING del objeto m1
        System.out.println("--------------");
        /** de esta manera se asignan los valores de forma EXPLICITA
         * m1.apodo = "Chiquito"; esto se puede hacer cuuando el tipo de clase es PUBLIC 
         * m1.nombre = "Fernando Chiquito"; cuando se pone en Private se debe usar getter y setter 
         * m1.tipo = "Perro"; 
         * m1.edad = 14;
         * m1.raza = "Beagle";
         * m1.cola = true;
         * m1.color = "Tricolor";
         */
        
        //OTRA MANERA DE CREAR UN OBJETO ES USANDO UN SERVICIO
        
        ServicioMascota sm= new ServicioMascota();
        
        Mascota m2 = sm.CrearMascota();
                
        System.out.println(m2);
    }

}
