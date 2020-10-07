package Practica4;

import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = scan.nextLine();

        StringBuffer stringBuffer = new StringBuffer(name);

        System.out.println(stringBuffer.reverse());
    }
}
