package Practica2;

import java.util.Scanner;

public class Exercise33 {

    public static int sum (int count, int n){

        int sum = 0;
        while(count <=n){
            sum += count;
            count ++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int count = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the last number: ");
        int n = Integer.parseInt(scan.nextLine());

        System.out.println("First: " + count);
        System.out.println("Last: " + n);
        System.out.println("Sum is: " + sum(count, n));
    }
}
