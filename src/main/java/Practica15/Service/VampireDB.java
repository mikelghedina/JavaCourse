package Practica15.Service;

import Practica15.Model.Vampire;

import java.util.ArrayList;

public class VampireDB {

    private ArrayList<Vampire> vampires;

    public VampireDB() {
        this.vampires = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "VampireDB{" +
                "vampires=" + vampires +
                '}';
    }

    public ArrayList<Vampire> getVampires() {
        return vampires;
    }
}
