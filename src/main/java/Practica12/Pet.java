package Practica12;

import java.util.ArrayList;

public class Pet {
    private String petType;
    private ArrayList<Vaccine> vaccines;
    private double weight;
    private double height;


    public Pet(String petType, ArrayList<Vaccine> vaccines, double weight, double height) {
        this.petType = petType;
        this.vaccines = vaccines;
        this.weight = weight;
        this.height = height;
    }



    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", vaccines=" + vaccines +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public ArrayList<Vaccine> getVaccines() {
        return vaccines;
    }

    public void setVaccines(ArrayList<Vaccine> vaccines) {
        this.vaccines = vaccines;
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
}
