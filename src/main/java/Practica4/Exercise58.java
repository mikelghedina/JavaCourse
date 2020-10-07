package Practica4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        int i = 0;
        while(true){
            System.out.println("Type a word: ");
            String name = scan.nextLine();

            if(list.contains(name)){
                System.out.println("You gave the word "+ name + " twice");
            }else{
                list.add(name);
            }
            System.out.println(list);
        }
    }
}
