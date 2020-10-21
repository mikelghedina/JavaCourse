package Practica12.Controller;


import Practica12.Model.Apartment;
import Practica12.Model.Date;
import Practica12.Model.Pet;
import Practica12.Model.Student;
import Practica12.Service.StudentDataBase;
import Practica12.Utils.EditOptions;
import Practica12.Utils.StudentUtils;


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
                System.out.println("Write \"Yes\"");
                String command01= scan.nextLine();
                //check grades, need to implement, not done yet.
                if(command01.toLowerCase().equalsIgnoreCase("Yes".toLowerCase())){
                    System.out.println("In order to create an account for you, we need you to introduce the following data:");
                    System.out.println("Name: ");
                    String name = scan.nextLine();
                    System.out.println("Last name: ");
                    String lastName = scan.nextLine();
                    System.out.println("Weight: ");
                    double weight = Double.parseDouble(scan.nextLine());
                    System.out.println("Height: ");
                    double height = Double.parseDouble(scan.nextLine());
                    System.out.println("Birthdate: "+ "Day: "); int day = Integer.parseInt(scan.nextLine());
                    System.out.println("Month: ");int month = Integer.parseInt(scan.nextLine());
                    System.out.println("Year: "); int year = Integer.parseInt(scan.nextLine());
                    System.out.println("ID:");
                    String ID = scan.nextLine();
                    System.out.println("Apartment Address:");
                    String apartment = scan.nextLine();
                    Student student = new Student(name, lastName,weight,height,new Date(day, month, year),ID,new Apartment(apartment));
                    System.out.println("Do you have any pet? Y/N");
                    String hasPet = scan.nextLine();
                    if(hasPet.toLowerCase().equalsIgnoreCase("Y".toLowerCase())){
                        System.out.println("Type of Pet:");
                        String petType = scan.nextLine();
                        student.getPetsList().add(new Pet(petType));
                        continue;
                    }else if(hasPet.toLowerCase().equalsIgnoreCase("N".toLowerCase())){
                        continue;
                    }else{
                        System.out.println("Unknown command");
                    }
                    studentDB.getStudents().add(student);
                    student.createFullCredentials();
                    System.out.println("Your account was created successfully!");
                    System.out.println("These will be your credentials to enter your campus: ");
                    System.out.println("Username: "+ student.getUserName());
                    System.out.println("Password: "+ student.getPassword());
                }else{
                    System.out.println("Unknown command.");
                    return;
                }
            }else if (command0.toLowerCase().equalsIgnoreCase("N".toLowerCase())){
                System.out.println("Enter your Username:");
                String userName = scan.nextLine();
                System.out.println("Enter your Password:");
                String password = scan.nextLine();
                if(StudentUtils.isAcceptedUserName(studentDB,userName)||StudentUtils.isAcceptedPassword(studentDB, password)){
                    while (true){
                        System.out.println("Welcome again!");
                        System.out.println("Choose an option: Show, Edit, Exit");
                        String command1 = scan.nextLine();
                        if(command1.toLowerCase().equalsIgnoreCase("Show".toLowerCase())){
                            StudentUtils.printStudentInfo(studentDB, userName);
                        }
                        else if(command1.toLowerCase().equalsIgnoreCase("Edit".toLowerCase())){
                            System.out.println("What do you want to edit?");
                            EditOptions.printEditOptions();
                            EditOptions.loopEdit(scan, StudentUtils.getStudentFromUser(studentDB, userName));
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
