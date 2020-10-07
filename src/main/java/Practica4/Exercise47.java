package Practica4;

import java.util.Scanner;

public class Exercise47 {


    public static int calculateCharacters (String name){

        int result = name.length();
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Type your name:");
        String name = scan.nextLine();


        System.out.println("Number of characters: " + calculateCharacters(name));
        System.out.println(name + " has " + calculateCharacters(name) + " characters." );

    }
}
