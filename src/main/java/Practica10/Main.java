package Practica10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BirdsDatabase db = new BirdsDatabase();

        /*db.addBird("Russinyol", "Dakus");
        db.addBird("Andrea", "Dekus");
        System.out.println(db);*/

        while(true){
            String command = ask(scan, "Option?");

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add(scan,db);
            } else if (command.equals("Observation")) {
                observation(scan,db);
            } else if (command.equals("Show")) {
                show(scan,db);
            } else if (command.equals("Statistics")) {
                statistics(scan, db);
            }else if(command.equals("Menu")){
                menu();
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
    public static String ask(Scanner input, String option) {

        System.out.println(option);
        String in = input.nextLine();
        return in;
    }

    public static void add(Scanner input, BirdsDatabase db) {

        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Latin Name: ");
        String latinName = input.nextLine();
        db.addBird(name, latinName);
    }

    public static void observation(Scanner input, BirdsDatabase db) {

        System.out.println("What was observed? ");
        String birdObserved = input.nextLine();
        for(Bird bird: db.getBirds()){
            if(bird.getName().trim().equalsIgnoreCase(birdObserved.trim())){
                bird.setObservations(bird.getObservations()+ 1);
                return;
            }
        }
        System.out.println("This is not a bird");
    }
    public static void show(Scanner input, BirdsDatabase db) {
        System.out.println("What? ");
        String birdName = input.nextLine();
        for(Bird bird: db.getBirds()){
            if(bird.getName().trim().equalsIgnoreCase(birdName.trim())){
                bird.printBird();
                return;
            }
        }
        System.out.println("Wrong word");
    }
    public static void statistics(Scanner input, BirdsDatabase db) {
        for(Bird bird: db.getBirds()){
            bird.printBird();
        }
    }
    public static void menu(){
        System.out.println("Add");
        System.out.println("Observation");
        System.out.println("Show");
        System.out.println("Statistics");
        System.out.println("Quit");
    }
}
