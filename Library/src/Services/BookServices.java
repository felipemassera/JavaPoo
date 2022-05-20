package Services;

import Entity.Book;
import java.util.Scanner;

;

/**
 *
 * @author Felipe
 */
public class BookServices {
    //7 i created a function for charge the book settings

    public Book newBook() {
//número de ISBN, el título,
//el autor del libro y el numero de páginas
        Book b1 = new Book(); // de esta manera se inicia el constructor vacio
        Scanner read = new Scanner(System.in);

        System.out.println("Bienvnido a la biblioteca");
        System.out.println("Ingrese ISBN");
        b1.setISBN(read.nextInt());
        System.out.println("Ingrese title");
        b1.setTitle(read.next());
        System.out.println("Ingrese Author");
        b1.setAuthor(read.next());
        System.out.println("Number pages");
        b1.setNumberPages(read.nextInt());

        return b1;
    }

    public void viewbook(Book b1) {
        System.out.println("ISBN =" + b1.getISBN());
        System.out.println("Title =" + b1.getTitle());
        System.out.println("Author =" + b1.getAuthor());
        System.out.println("Pages =" + b1.getNumberPages());

    }
}
