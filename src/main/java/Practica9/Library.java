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
        if(this.bookList.contains(title)){
            return this.bookList;
        }else{
            System.out.println("no matches found");
            return null;
        }
    }
    /*ArrayList<Book> searchByPublisher(String publisher){


    }*/
    /*public ArrayList<Book> searchByYear(int year){


    }*/


    public void addBook(Book newBook){
        bookList.add(newBook);
    }

    public void printBooks (){

        for(Book book: bookList){
            book.printBook();
        }
    }
}




