/* Crear un método para cargar un libro pidiendo los
datos al usuario y 
 */
package Servicio;

import Class.Libro;
import java.util.Scanner;


public class LibroServicio {
        
    Scanner read = new Scanner (System.in).useDelimiter("\n"); // el usedelimiter sirve para que al poner espacios no te de error
    
    public Libro nuevoLibro(){ //funcion para crear un libro y darle forma
   
        Libro p1 = new Libro(); //crea un nuevo libro
        System.out.println("ingrese el nombre del autor");
        p1.setAutor(read.next());
        System.out.println("ingrese el titulo del libro");
        p1.setTitulo(read.next());
        System.out.println("ingrese el ISNB");
        p1.setISBN(read.nextInt());
        System.out.println("Ingrese numero de paginas");
        p1.setPaginas(read.nextInt());
        
        return p1; //devuelve el dato lleno
    }
    /** luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas */
    
    public void verLibro(Libro x){ //void significa vacio, no devuelve nada. 
        
        System.out.println("autor: "+x.getAutor() );   
        System.out.println("Titulo: "+x.getTitulo());
        System.out.println("ISNB: "+x.getISBN());
        System.out.println("Paginas: "+x.getPaginas());
         
    }
  
    
}
