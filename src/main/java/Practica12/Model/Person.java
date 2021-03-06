package Practica12.Model;

import java.util.ArrayList;

public class Person {
    private String name;
    private String lastName;
    private double weight;
    private double height;
    private Date birthDate;
    private String ID;
    private ArrayList<Pet> petsList;
    private Apartment apartment;


    public Person(String name, String lastName, double weight, double height, Date birthDate,String ID, Apartment apartment){
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
        this.birthDate = birthDate;
        this.petsList = new ArrayList<>();
        this.ID = ID;
        this.apartment = apartment;
    }

    public Person(String name, String lastName, double weight, double height, Date birthDate, String ID, Apartment apartment, ArrayList<Pet> petsList) {
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
        this.birthDate = birthDate;
        this.ID = ID;
        this.apartment = apartment;
        this.petsList = petsList;
    }

    public boolean hasPet(){
        return petsList.size() > 0;
    }

    public String printPerson(){
        return "Name: " +getName()+ "\nLast Name: "+getLastName() +"\nWeight: "+getWeight() +
                "\nHeight: "+getHeight()+"\nBirthdate: "+birthDate.printDate()+ "\nID: "+ getID() +
                "\nPets: " + getPetsList() + "\nApartment: " + getApartment();
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", birthDate=" + birthDate +
                ", ID='" + ID + '\'' +
                ", petsList=" + petsList +
                ", apartment=" + apartment +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<Pet> getPetsList() {
        return petsList;
    }

    public void setPetsList(ArrayList<Pet> petsList) {
        this.petsList = petsList;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
}
