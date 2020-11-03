package Practica15.Service;

import Practica15.Model.Vampire;

import java.util.ArrayList;
import java.util.Random;

public class VampireDB {

    private Random random;
    private ArrayList<Vampire> vampires;


    public VampireDB() {
        this.vampires = new ArrayList<>();
        this.random = new Random();
    }
    public void addVampires(int numberOfVampires, int width, int height){
        for(int i = 0; i<numberOfVampires; i++){
            vampires.add(new Vampire(random.nextInt(width), random.nextInt(height), false));
        }
    }

    public ArrayList<Vampire> getVampires() {
        return vampires;
    }
}