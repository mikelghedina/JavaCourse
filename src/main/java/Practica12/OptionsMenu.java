package Practica12;

import org.graalvm.compiler.replacements.StringSubstitutions;

import java.util.Scanner;

public class OptionsMenu {

    private StudentDataBase studentDB;
    private Scanner scan;

    public OptionsMenu(){
        this.scan = new Scanner(System.in);
        this.studentDB = new StudentDataBase();
    }

    public void StartConsole(){
        while(true){
            System.out.println("Are you a new student? Y/N");
            String command0 = scan.nextLine();

            if(command0.toLowerCase().equalsIgnoreCase("Y".toLowerCase())){
                System.out.println("Let me ask you a few questions so you are suitable to enter this University.");

            }else if (command0.toLowerCase().equalsIgnoreCase("N".toLowerCase())){
                System.out.println("Enter your Username:");
                String userName = scan.nextLine();
                System.out.println("Enter your Password:");
                String password = scan.nextLine();
                if(StudentUtils.isAcceptedUserName(studentDB,userName)||StudentUtils.isAcceptedPassword(studentDB, password)){
                    while (true){
                        System.out.println("Welcome again!");
                        System.out.println("Choose an option: Show, Exit");
                        String command1 = scan.nextLine();
                        if(command1.toLowerCase().equalsIgnoreCase("Show".toLowerCase())){
                            StudentUtils.printStudentInfo(studentDB, userName);
                        }else if(command1.toLowerCase().equalsIgnoreCase("Exit".toLowerCase())){
                            return;
                        }else{
                            System.out.println("UnknownCommand");
                        }
                    }
                }else{
                    System.out.println("Wrong username or password.");
                }
            }else{
                System.out.println("Unknown command!");
                return;
            }
        }
    }

    public StudentDataBase getStudentDB() {
        return studentDB;
    }
}
