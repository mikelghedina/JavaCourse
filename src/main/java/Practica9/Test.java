package Practica9;



public class Test {
    public static void main(String[] args) {

        Library barcelonaLibrary = new Library("Maragall", "Barcelona");
        Book book1 = new Book("Misery", "Stephen King", "Viking Press" ,2017);
        Book book2 = new Book("Cuentos 1", "Alianza Editorial","Alianza Editorial",1905);
        Book book3 = new Book("Cuentos 2","Edgar Allan Poe","Alianza Editorial");

        barcelonaLibrary.addBook(book1);
        barcelonaLibrary.addBook(book2);
        barcelonaLibrary.addBook(book3);


        barcelonaLibrary.printBooks(barcelonaLibrary.getBookList());

        //barcelonaLibrary.searchByTitle("Mis");

        /*System.out.println(barcelonaLibrary.searchByTitle("Mis"));
        System.out.println(barcelonaLibrary.searchByYear(1905));
        System.out.println(barcelonaLibrary.searchByPublisher("ViKing"));
        */

        System.out.println("----------------------------------------");

        barcelonaLibrary.printBooks(barcelonaLibrary.searchByTitle("cue   "));

        System.out.println("----------------------------------------");

        barcelonaLibrary.printBooks(barcelonaLibrary.searchByPublisher("   lianza"));

        System.out.println("----------------------------------------");
        barcelonaLibrary.printBooks(barcelonaLibrary.searchByYear(2017));



    }
}
