package Practica11;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try{
            int day = Integer.parseInt(scan.nextLine());
            int month = Integer.parseInt(scan.nextLine());
            int year = Integer.parseInt(scan.nextLine());
            Utils.readDate(day,month,year);
        }catch(NumberFormatException e)
        {
            System.out.println("This is not a number");
        }

        System.out.println(Utils.leapYear(2100));
    }
}
