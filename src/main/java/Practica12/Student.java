package Practica12;

public class Student {
    private String name;
    private String lastName;
    private double weight;
    private double height;
    private int age;

    public Student (String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    public Student(String name, String lastName, double weight, double height, int age) {
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
