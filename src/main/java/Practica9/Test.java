package Practica9;



public class Test {
    public static void main(String[] args) {

        Library barcelonaLibrary = new Library("Maragall", "Barcelona");
        Book book1 = new Book("Misery", "Viking Press", 2017);
        Book book2 = new Book("Cuentos 1", "Alianza Editorial",1905);
        Book book3 = new Book("Cuentos 2","Edgar Allan Poe");

        barcelonaLibrary.addBook(book1);
        barcelonaLibrary.addBook(book2);
        barcelonaLibrary.addBook(book3);


        barcelonaLibrary.printBooks();

        barcelonaLibrary.searchByTitle("Mis");


    }
}
