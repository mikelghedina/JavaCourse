package Practica2;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the second one: ");
        int secondNumber = Integer.parseInt(scan.nextLine());

        System.out.println("First: " + firstNumber);
        System.out.println("Last: "+ secondNumber);

        for(int i = firstNumber; i<= secondNumber; i++){
            if(firstNumber<=secondNumber) {
                System.out.println(i);
            }
        }

    }
}
