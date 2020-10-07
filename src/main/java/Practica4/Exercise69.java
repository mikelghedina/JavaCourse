package Practica4;

import java.util.Scanner;

public class Exercise69 {
    public static boolean palindrome(String text) {
        // write your code here
        StringBuffer reversed = reverse(text);
        if(reversed.toString().equals(text)){
            return true;
        }
        return false;
    }
    public static StringBuffer reverse(String text) {
        StringBuffer stringBuffer = new StringBuffer(text);
        return stringBuffer.reverse();
    }
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type a text: ");
        String text = reader.nextLine();

        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
