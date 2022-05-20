package ejercicio1;

import LibrosClass.Libros;
import LibrosServices.LibrosServices;

public class LibrosMain {

    public static void main(String[] args) {

        LibrosServices ls = new LibrosServices();
        Libros b1 = ls.newLibros();
        Libros b2 = ls.newLibros();
        
       
        
        ls.ver(b1);
        ls.ver(b2);
    }

}
