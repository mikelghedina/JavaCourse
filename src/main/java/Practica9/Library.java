package Practica9;

import java.util.ArrayList;

public class Library {
    private final String libraryName;
    private final String localization;
    private final ArrayList<Book> bookList;


    public Library(String libraryName, String localization) {
        this.libraryName = libraryName;
        this.localization = localization;
        this.bookList = new ArrayList<>();
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> matches = new ArrayList<>();
        for(Book book : this.bookList){
            //System.out.println(book.getTitle());
            if(StringUtils.included(book.getTitle(),title)){
                matches.add(book);
            }
        }
        return matches;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> matches = new ArrayList<>();
        for(Book book : this.bookList){
            //System.out.println(book.getPublisher());
            if(StringUtils.included(book.getPublisher(),publisher)){
                matches.add(book);
            }else if (book.getPublisher()== null){
                return matches;
            }
        }
        return matches;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> matches = new ArrayList<>();
        for(Book book : this.bookList){
            //System.out.println(book.getPublishingYear());
            if(book.getPublishingYear()== year){
                matches.add(book);
            }
        }
        return matches;
    }


    public void addBook(Book newBook){
        bookList.add(newBook);
    }

    public void printBooks (ArrayList<Book> bookList){
        for(Book book: bookList){
            book.printBook();
        }
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getLocalization() {
        return localization;
    }
}




