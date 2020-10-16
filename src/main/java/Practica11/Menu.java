package Practica11;

import java.util.Scanner;

public class Menu {

    private Scanner scan;

    public Menu(){
        this.scan = new Scanner(System.in);
    }
    public void startMenu (){
        while(true){
            System.out.println("Introduce a negative number to quit");
            System.out.println("Introduce a date");

            try{
                int date = Integer.parseInt(scan.nextLine());
            }catch (Exception e){
                System.out.println("Introduce the date in numbers.");
            }

        }
    }
}
