package Practica10;

import java.util.ArrayList;

public class BirdsDatabase {


    private ArrayList<Bird> birds;

    public BirdsDatabase() {
        this.birds = new ArrayList<>();
    }
    public void addBird(String name, String latinName){
        getBirds().add(new Bird(name, latinName));
    }


    @Override
    public String toString() {
        return "BirdsDatabase{" +
                "birds=" + birds +
                '}';
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }

    public void setBirds(ArrayList<Bird> birds) {
        this.birds = birds;
    }
}
