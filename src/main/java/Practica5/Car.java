package Practica5;

import java.util.ArrayList;

public class Car {

    public String carColor;
    public int doorsNumber;
    public int places;
    public int speed;

    @Override
    public String toString() {
        return "Car{" +
                "carColor='" + carColor + '\'' +
                ", doorsNumber=" + doorsNumber +
                ", places=" + places +
                ", speed=" + speed +
                '}';
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
