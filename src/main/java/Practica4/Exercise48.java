package Practica4;

import java.util.Scanner;

public class Exercise48 {

    public static char firstCharacter(String name){

        char firstLetter = name.charAt(0);
        return firstLetter;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce your name: ");
        String name = scan.nextLine();

        System.out.println("The first letter of your name is: " + firstCharacter(name));
    }
}
