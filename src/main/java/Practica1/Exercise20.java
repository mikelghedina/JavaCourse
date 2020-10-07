package Practica1;


import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("Introduce your username: ");
            String username = scan.nextLine();
            System.out.println("Introduce your password: ");
            String password = scan.nextLine();

            if(username.equals("alex") && password.equals("mightyducks") || username.equals("emily") && password.equals("cat")){
                System.out.println("Welcome to this world " + username + ". You are now logged in!");
                break;
            }
            else{
                System.out.println("Wrong username or password! Try again with a valid one.");
            }
        }
    }
}

