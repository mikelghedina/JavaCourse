package Practica1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Let's calculate the circumference of a circle!");
        System.out.println("Type the radius of the circumference:");

        int radius = Integer.parseInt(scan.nextLine());
        double result = 2 * Math.PI * radius;

        System.out.println("The circumference of this circle is: " + result);


    }
}
