package Practica14;

public class Animal implements Action {

    private int age;
    private double weight;
    private double height;

    public Animal(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
