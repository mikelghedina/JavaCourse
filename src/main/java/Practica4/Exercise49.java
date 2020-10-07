package Practica4;

import java.util.Scanner;

public class Exercise49 {

    public static int calculateCharacters (String name){

        int result = name.length();
        return result;
    }

    public static char lastCharacter(String text){
        int m = 0;
        char lastChar = text.charAt(m);
        return lastChar;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Introduce your name: ");
        String name = scan.nextLine();

        int numberOfChars = calculateCharacters(name);
        System.out.println("The last character of your name is: " + lastCharacter(name));
    }
}
