package Ejercicios;


import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, how many years wanna convert to seconds?");

        int yearsToSeconds = Integer.parseInt(scan.nextLine());
        int result = yearsToSeconds * 60 * 60 * 24 * 365;

        System.out.println(yearsToSeconds + " year/s are: " + result + " seconds.");

    }

}

