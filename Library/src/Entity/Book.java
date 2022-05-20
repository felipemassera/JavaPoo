/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 * ISBN, Título, Autor, Número de páginas
 */
public class Book {
    //1 atributes for object

    private int ISBN;
    private int numberPages;
    private String title;
    private String author;

//2 constructor empty
    public Book() {
    }

//3 constructor fully
    public Book(int ISBN, int numberPages, String title, String author) {
        this.ISBN = ISBN;
        this.numberPages = numberPages;
        this.title = title;
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    //4 getter y setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // to string
    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", numberPages=" + numberPages + ", title=" + title + ", author=" + author + '}';
    }

}
