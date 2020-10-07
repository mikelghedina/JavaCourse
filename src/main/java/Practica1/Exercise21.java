package Practica1;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce a year to figure out if it is a leap year or not: ");
        int year = Integer.parseInt(scan.nextLine());

        if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
            System.out.println("It is a leap year!");
        }
        else{
            System.out.println("It is not a leap year.");
        }

    }
}
