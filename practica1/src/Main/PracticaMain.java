/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 */
package Main;

import Class.Libro;
import Servicio.LibroServicio;


public class PracticaMain {

  
    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio(); //declaran en el main que existe la info del servicio
        
        Libro  L1 = ls.nuevoLibro();
        Libro  L2 = ls.nuevoLibro();
        
        
        ls.verLibro(L1);
        ls.verLibro(L2);
        
    }
    
}
