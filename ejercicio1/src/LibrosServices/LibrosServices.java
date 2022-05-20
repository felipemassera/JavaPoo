/*  Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas. */
package LibrosServices;

import LibrosClass.Libros;
import java.util.Scanner;

public class LibrosServices {

    Scanner leer = new Scanner(System.in);

    public Libros newLibros() {

        Libros bx = new Libros();

        System.out.println("Carga ISNB");
        bx.setISBN(leer.nextInt());
        System.out.println("Carga Titulo");
        bx.setTitulo(leer.next());
        System.out.println("Carga Autor");
        bx.setAutor(leer.next());
        System.out.println("Carga Paginas");
        bx.setPaginas(leer.nextInt());
        System.out.println("Es comic? S N");
        String comic=leer.next().toUpperCase();
        if (comic.equals("S")) {
            bx.setComic(true);
        }else{
            bx.setComic(false);
        }
        return bx;
    }
    public void ver(Libros  b1){
        System.out.println("ISNB : "+b1.getISBN());
        System.out.println("Titulo: "+b1.getTitulo());
        System.out.println("Autor: "+b1.getAutor());
        System.out.println("Paginas: "+b1.getPaginas());
        System.out.println("Es COmic? "+b1.isComic());
    }
}
