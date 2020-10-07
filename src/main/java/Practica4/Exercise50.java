package Practica4;

import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = scan.nextLine();

        int numberOfChars = name.length();

        if(numberOfChars < 3){
            System.out.println("Nothing");
        }else{
            System.out.println("1. Character: " + name.charAt(0));
            System.out.println("1. Character: " + name.charAt(1));
            System.out.println("1. Character: " + name.charAt(2));
        }
    }
}
