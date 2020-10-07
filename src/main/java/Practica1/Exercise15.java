package Practica1;


import java.util.Scanner;

public class Exercise15 {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Let's check if you already reached the age of majority!");
        System.out.println("How old are you?");
        int age = Integer.parseInt(scan.nextLine());
        if(age >= 18 && age<80){
            System.out.println("You have reached the age of majority!");

        }
        else if (age >= 80){
            System.out.println("You are old, take care please.");
        }
        else {
            System.out.println("You have not reached the age of majority yet. Take it easy.");
        }

    }

}
