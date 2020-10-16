package Practica10;

import java.util.Scanner;

public class Utils {

    public static String ask(Scanner input, String option) {

        System.out.println(option);
        return input.nextLine();
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
        System.out.println("Who observed?(Introduce your name)");
        String personWhoObserved = input.nextLine();
        System.out.println("Introduce your last name");
        String lastNamePerson = input.nextLine();
        System.out.println("How old are you?");
        int agePerson = Integer.parseInt(input.nextLine());
        System.out.println("Thanks, your data has been stored successfully");
        for(Bird bird: db.getBirds()){
            if(StringUtils.included(bird, birdObserved)){
                bird.setObservations(bird.getObservations()+ 1, personWhoObserved,lastNamePerson,agePerson);
                return;
            }
        }
        System.out.println("This is not a bird");
    }
    public static void show(Scanner input, BirdsDatabase db) {
        System.out.println("What? ");
        String birdName = input.nextLine();
        for(Bird bird: db.getBirds()){
            if(StringUtils.included(bird, birdName)){
                bird.printBird();
                return;
            }
        }
        System.out.println("This bird is not stored in the Database.");
    }
    public static void statistics(BirdsDatabase db) {
        for(Bird bird: db.getBirds()){
            bird.printBird();
        }
    }
    public static void menu(){
        System.out.println("Add");
        System.out.println("Observation");
        System.out.println("Show");
        System.out.println("Statistics");
        System.out.println("Quit\n");
    }
}
