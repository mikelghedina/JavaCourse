package Practica12.Model;

import java.util.ArrayList;

public class Student extends Person{

    private String userName;
    private String password;

    public Student(String name, String lastName, double weight, double height, Date birthDate, String ID, Apartment apartment) {
        super(name, lastName, weight, height, birthDate, ID, apartment);
    }
    public Student(String name, String lastName, double weight, double height, Date birthDate, String ID, Apartment apartment, String username, String password) {
        super(name, lastName, weight, height, birthDate, ID, apartment);
        this.userName = username;
        this.password = password;

    }
    public Student(String name, String lastName, double weight, double height, Date birthDate, String ID, Apartment apartment, ArrayList<Pet> pets, String username, String password) {
        super(name, lastName, weight, height, birthDate, ID, apartment, pets);
        this.userName = username;
        this.password = password;

    }


    public boolean isLegalAge(){
        return (Date.calculateAge(getBirthDate().getYear())) >= 18;
    }
    public double IMC(){
        return getWeight()/(getHeight()*getHeight());
    }
    public void createFullCredentials(){
        setUserName();
        setPassword();
        //System.out.println(getUserName());
        //System.out.println(getPassword());
    }

    public void printFullStudentInfo(){
        System.out.println(super.printPerson());
        System.out.println("Is this student an adult? "+ isLegalAge());
        System.out.println("IMC= "+IMC());
        System.out.println("User: "+getUserName());
        System.out.println("Pass: "+getPassword());

    }
    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName() {
        this.userName = getName().substring(0,3)+ getLastName().substring(0,3);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        this.password = getName().substring(0,3)+getLastName().substring(0,3)+getID().substring(0,3);
    }
}
