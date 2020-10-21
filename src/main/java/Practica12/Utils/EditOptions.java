package Practica12.Utils;

import Practica12.Model.Apartment;
import Practica12.Model.Pet;
import Practica12.Model.Student;
import Practica12.Service.StudentDataBase;

import java.util.Scanner;

public class EditOptions {



    public static void printEditOptions(){
        System.out.println("Name");
        System.out.println("Last Name");
        System.out.println("Weight");
        System.out.println("Height");
        System.out.println("ID");
        System.out.println("Pets");
        System.out.println("Apartment");
    }
    public static void loopEdit(Scanner scan, Student student){
        while(true){
            String editCommand = scan.nextLine();
            if(editCommand.toLowerCase().equalsIgnoreCase("Name".toLowerCase())){
                System.out.println("Write your new name: ");
                String name = scan.nextLine();
                student.setName(name);
            }else if(editCommand.toLowerCase().equalsIgnoreCase("Last Name".toLowerCase())){
                System.out.println("Write your new Last Name: ");
                String lastName = scan.nextLine();
                student.setLastName(lastName);
            }
            else if(editCommand.toLowerCase().equalsIgnoreCase("Weight".toLowerCase())){
                System.out.println("Set your weight: ");
                double weight = Double.parseDouble(scan.nextLine());
                student.setWeight(weight);
            }else if(editCommand.toLowerCase().equalsIgnoreCase("Height".toLowerCase())){
                System.out.println("Set your height: ");
                double height = Double.parseDouble(scan.nextLine());
                student.setWeight(height);
            }
            else if(editCommand.toLowerCase().equalsIgnoreCase("ID".toLowerCase())){
                System.out.println("Set your ID: ");
                String ID = scan.nextLine();
                student.setID(ID);
            }else if(editCommand.toLowerCase().equalsIgnoreCase("Pets".toLowerCase())){
                System.out.println("Options: Add, Remove, Quit");
                String petCommand = scan.nextLine();
                if(petCommand.toLowerCase().equalsIgnoreCase("Add".toLowerCase())){
                    System.out.println("Write the pet type: ");
                    String petType = scan.nextLine();
                    student.getPetsList().add(new Pet(petType));
                }else if(petCommand.toLowerCase().equalsIgnoreCase("Remove".toLowerCase())){
                    if(student.hasPet()){
                        System.out.println("Which one do you want to remove? ");
                        String petTypeToRemove = scan.nextLine();
                        for (Pet pet: student.getPetsList()) {
                            if(petTypeToRemove.toLowerCase().equalsIgnoreCase(pet.getPetType().toLowerCase())){
                                student.getPetsList().remove(pet);
                                System.out.println("Your pet was successfully removed from your profile.");
                            }
                        }
                        return;
                    }else{
                        System.out.println("You don't have a pet!");
                    }
                }else if(petCommand.toLowerCase().equalsIgnoreCase("Quit".toLowerCase())){
                    return;
                }
            }else if(editCommand.toLowerCase().equalsIgnoreCase("Apartment".toLowerCase())){
                System.out.println("Introduce your new address: ");
                String apartmentAddress = scan.nextLine();
                student.setApartment(new Apartment(apartmentAddress));
                return;
            }else{
                System.out.println("Unknown command.");
                return;
            }
        }
    }

}
