package Practica11;

import java.util.Scanner;

public class Menu {

    private final Scanner scan;

    public Menu(){
        this.scan = new Scanner(System.in);
    }
    public void startMenu (){

        try{
            int day = Integer.parseInt(scan.nextLine());
            int month = Integer.parseInt(scan.nextLine());
            int year = Integer.parseInt(scan.nextLine());
            Utils.readDate(day,month,year);
        }catch(NumberFormatException e)
        {
            System.out.println("This is not a number");
        }
    }
}
