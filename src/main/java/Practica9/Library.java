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
                System.out.println(matches);
            }
        }
        return this.bookList;
    }
    ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> matches = new ArrayList<>();
        for(Book book : this.bookList){
            System.out.println(book.getTitle());
            if(book.getPublisher().contains(publisher)){
                matches.add(book);
                System.out.println(matches);
            }
        }
        return this.bookList;

    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> matches = new ArrayList<>();
        for(Book book : this.bookList){
            System.out.println(book.getTitle());
            if(book.getPublishingYear()== year){
                matches.add(book);
                System.out.println(matches);
            }
        }
        return this.bookList;

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




