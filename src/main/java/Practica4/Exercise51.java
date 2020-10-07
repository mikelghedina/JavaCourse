package Practica4;

import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Type your name: ");
        String name = scan.nextLine();


        int count = 0;
        char actualCharacter = name.charAt(0);

        while(name.length() != count){
            count ++;
            actualCharacter = name.charAt(count -1);
            System.out.println(count + ". Character: " + actualCharacter);
        }
    }
}
