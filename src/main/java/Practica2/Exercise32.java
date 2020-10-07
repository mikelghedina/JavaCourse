package Practica2;


import java.util.Scanner;


public class Exercise32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Until what?");
        int n = Integer.parseInt(scan.nextLine());

        int count = 0;
        int sum = 0 ;
        while(count<= n){
            sum += count;
            count ++;
            }
        System.out.println("Sum is: " + sum);
        }

    }

