package Practica14;


public class Person implements HumanAction, Action {

    private String name;
    private String lastName;
    private int age;
    private double height;
    private double weight;

    public Person(String name, String lastName, int age, double height, double weight) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void talk() {

    }

    @Override
    public void createPrograms() {

    }

    @Override
    public void study() {

    }

    @Override
    public void playViolin() {

    }

    @Override
    public void listen() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public void sleep() {

    }
}
