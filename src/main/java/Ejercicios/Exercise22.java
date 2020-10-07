package Ejercicios;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        while (true){

            System.out.println("Type the password: ");
            String pass = scan.nextLine();

            if(pass.equals("carrot")){
                System.out.println("This is the secret message!");
                break;
            }
            else {
                System.out.println("The password introduced is wrong. Try again.");
            }
        }
    }
}
