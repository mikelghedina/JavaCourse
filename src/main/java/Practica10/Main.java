package Practica10;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdsDatabase db = new BirdsDatabase();
        Menu menu = new Menu(scan, db);
        db.setBirds(ListInitialBirds.initialBirds());
        menu.loop();

    }

}
