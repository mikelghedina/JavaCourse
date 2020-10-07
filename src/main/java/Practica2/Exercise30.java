package Practica2;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number please: ");
        int number = Integer.parseInt(scan.nextLine());

        for(int i = 1; i <= number; i++){
            System.out.println(i);
        }
    }
}
