package Practica12.Utils;

import Practica12.Service.StudentDataBase;

import java.util.Scanner;

public class EditOptions {

    private Scanner scan;
    private StudentDataBase studentDataBase;
    public static void printEditOptions(){
        System.out.println("Name");
        System.out.println("Last Name");
        System.out.println("Age");
        System.out.println("Weight");
        System.out.println("Height");
        System.out.println("BirthDate");
        System.out.println("ID");
        System.out.println("Pets");
    }

}
