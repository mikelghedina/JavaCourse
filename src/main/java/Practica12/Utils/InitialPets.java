package Practica12.Utils;

import Practica12.Model.Pet;

import java.util.ArrayList;

public class InitialPets {

    public static ArrayList<Pet> fillPets(){
        ArrayList<Pet> petList = new ArrayList<>();

        petList.add(new Pet("Dog", InitialVaccines.dogVaccinesList(), 10, 1.00,1));
        petList.add(new Pet("Cat", InitialVaccines.catVaccinesList(), 7, 0.80,3));
        return petList;
    }
}
