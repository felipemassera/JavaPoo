/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío.*/
package LibrosClass;

public class Libros {

    int ISBN;
    int paginas;
    String titulo;
    String autor;
    boolean comic;

    public Libros() {
       
    }

    public Libros(int ISBN, int paginas, String titulo, String autor, boolean comic) {
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.titulo = titulo;
        this.autor = autor;
        this.comic = comic;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isComic() {
        return comic;
    }

    public void setComic(boolean comic) {
        this.comic = comic;
    }

    
}
