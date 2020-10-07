package Practica1;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's see if this number is even or odd!");
        System.out.println("Type a number:");
        int number = Integer.parseInt(scan.nextLine());
        if(number % 2 == 0){
            System.out.println("Number " + number + " is even.");
        }
        else{
            System.out.println("Number " + number + " is odd.");
        }
    }
}
