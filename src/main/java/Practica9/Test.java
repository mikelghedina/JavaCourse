package Practica9;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Library barcelonaLibrary = new Library("Maragall", "Barcelona");
        Book book1 = new Book("Misery", "Viking Press", 2017);
        Book book2 = new Book("Cuentos 1", "Alianza Editorial", 1809);

        barcelonaLibrary.addBook(book1);
        barcelonaLibrary.addBook(book2);


        barcelonaLibrary.printBooks();

        barcelonaLibrary.searchByTitle("Misery");

    }
}
