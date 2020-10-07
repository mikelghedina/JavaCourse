package Ejercicios;


import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's make a sum of two numbers...");
        System.out.println("Give me the first number:");
        int firstNumber = Integer.parseInt(scan.nextLine());
        System.out.println("Give me a second number:");
        int secondNumber = Integer.parseInt(scan.nextLine());
        int result = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);

    }

}
