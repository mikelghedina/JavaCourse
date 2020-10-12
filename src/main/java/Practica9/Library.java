package Practica9;

import java.util.ArrayList;

public class Library {
    private String libraryName;
    private String localization;
    private ArrayList<Book> bookList;


    public Library(String libraryName, String localization) {
        this.libraryName = libraryName;
        this.localization = localization;
        this.bookList = new ArrayList<>();
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> matches = new ArrayList<>();
        for(Book book : this.bookList){
            System.out.println(book.getTitle());
            if(book.getTitle().contains(title)){
                matches.add(book);
            }else{
                System.out.println("No matches found.");
            }
        }
        return matches;
    }
    ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> matches = new ArrayList<>();
        for(Book book : this.bookList){
            System.out.println(book.getPublisher());
            if(book.getPublisher().contains(publisher)){
                matches.add(book);
            }else{
                System.out.println("No matches found.");
            }
        }
        return matches;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> matches = new ArrayList<>();
        for(Book book : this.bookList){
            System.out.println(book.getPublishingYear());
            if(book.getPublishingYear()== year){
                matches.add(book);
            }else{
                System.out.println("No matches found.");
            }
        }
        return matches;
    }


    public void addBook(Book newBook){
        bookList.add(newBook);
    }

    public void printBooks (){

        for(Book book: bookList){
            book.printBook();
        }
    }
}




