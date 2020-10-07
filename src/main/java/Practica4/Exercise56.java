package Practica4;

import java.util.Scanner;

public class Exercise56 {
    public static StringBuffer reverse(String text) {
    // write your code here
    StringBuffer stringBuffer = new StringBuffer(text);
    return stringBuffer.reverse();
    }

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
