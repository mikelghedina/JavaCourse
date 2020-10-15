package Practica10;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BirdsDatabase db = new BirdsDatabase();

        /*db.addBird("Russinyol", "Dakus");
        db.addBird("Andrea", "Dekus");
        System.out.println(db);*/

        Menu menu = new Menu(scan, db);
        menu.loop();

    }

}
