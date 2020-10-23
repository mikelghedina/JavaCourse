package Practica14;

public class Cat extends Animal {

    private int numberLives;

    public Cat(int age, double weight, double height, int numberLives) {
        super(age, weight, height);
        this.numberLives = numberLives;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "numberLives=" + numberLives +
                '}';
    }

    public int getNumberLives() {
        return numberLives;
    }

    public void setNumberLives(int numberLives) {
        this.numberLives = numberLives;
    }
}
