package TestUF2404.Controller;

import TestUF2404.Model.Author;
import TestUF2404.Model.Book;
import TestUF2404.Utils.StringUtils;

import java.util.Scanner;

public class MenuOptions {

    public static void start(){
        Scanner reader = new Scanner(System.in);
        //to-do
        //Creem els tres autors i els tres llibres.
        Author author1 = new Author("Stephen King", "stephen.king@gmail.com",'M');
        Author author2 = new Author("J.K.Rowling", "jk.rowling@gmail.com",'F');
        Author author3 = new Author("H.P.Lovecraft", "hp.lovecraft@gmail.com",'M');

        Book book1 = new Book("Misery", author1.getName(), 1998, "Royal House", 15);
        Book book2 = new Book("It", author1.getName(), 2001, "Empire", 30);
        Book book3 = new Book("Bag of Bones", author1.getName(), 1988, "P.Project", 20);

        //Afegim els llibres a l'autor corresponent.
        author1.addBookToAuthor(book1);
        author1.addBookToAuthor(book2);
        author1.addBookToAuthor(book3);

        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);

        while(true){
            System.out.println("\nTria una de les opcions:");
            System.out.println("[1] Afegir llibre a "+ author2.getName());
            System.out.println("[2] Crear i assignar llibre a un autor");
            System.out.println("[0] Sortir");
            try{
                int command = Integer.parseInt(reader.nextLine());
                if(command== 1){
                    createBook(reader, author2);
                }else if(command==2){
                    createAndAssign(reader, author1, author2, author3);
                }else if(command==0){
                    break;
                }else{
                    System.out.println("No està dins de les opcions oferides");
                }
            }catch (NumberFormatException e){
                System.out.println("Unknown command.");
            }
        }
    }

    public static void createBook(Scanner reader, Author author){
        //to-do
        while(true){
            //Demanem les dades per consola per poder afegir el llibre desitjat.

            System.out.println("Introdueix el nom del llibre que vols afegir: ");
            String bookName = reader.nextLine();

            System.out.println("Introdueix l'any de publicació: ");
            int year = Integer.parseInt(reader.nextLine());

            System.out.println("Introdueix l'editorial: ");
            String publisher = reader.nextLine();

            System.out.println("Introdueix el preu del llibre: ");
            int cost = Integer.parseInt(reader.nextLine());

            //Afegim el llibre amb les dades introduides a la llista de llibres del segon autor direcatment.

            author.addBookToAuthor(new Book(bookName,author.getName(), year, publisher, cost));

            System.out.println("Les dades han sigut introduïdes correctament al segon autor");

            //Demanem a l'usuari si vol afegir un altre llibre, en cas contrari tanquem el bucle. Si la resposta del
            // usuari no concorda amb les opcions oferides en pantalla, resposta: Unknown Command. Segueix el bucle fins donar una resposta satisfactoria.

            System.out.println("Vols introduir un altre llibre? S(Sí)/N(No)");
            String response = reader.nextLine();

            if(StringUtils.included(response,"N")){
                return;
            }else if(StringUtils.included(response, "S")){

            }else{
                System.out.println("Unknows command.");
            }
        }
    }
    public static void createAndAssign(Scanner reader, Author author1, Author author2, Author author3){
        //to-do
        //
        System.out.println("A quin dels autors pertany el llibre que vols affegir?");
        System.out.println("Opcions: ");
        System.out.println("[1] Primer autor: "+ author1.getName());
        System.out.println("[2] Segon autor: "+ author2.getName());
        System.out.println("[3] Tercer autor: "+ author3.getName());
        try {
            int command = Integer.parseInt(reader.nextLine());
            if(command==1){
                createBook(reader,author1);
            }else if(command==2){
                createBook(reader, author2);
            }else if(command==3){
                createBook(reader, author3);
            }else{
                System.out.println("No està dins de les opcions establertes.");
            }
        }catch (NumberFormatException e){
            System.out.println("Escriu un numero siusplau.");
        }
    }
}
