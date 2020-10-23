package TestUF2404.Model;

import java.util.ArrayList;

public class Author {

    private String name;
    private String email;
    private char gender;
    private ArrayList<Book> books;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.books = new ArrayList<Book>();
    }
    public void addBookToAuthor(Book book){
        books.add(book);
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        // to-do, print books as well
        String author = "\n" + getName() + "(" + getGender() + ") at " + getEmail() + " List of books: "+ this.books.toString();
        return author;
    }
}
