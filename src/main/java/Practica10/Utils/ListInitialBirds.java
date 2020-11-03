package Practica10.Utils;

import Practica10.Model.Bird;

import java.util.ArrayList;

public class ListInitialBirds {

    public static ArrayList<Bird> initialBirds(){
        ArrayList<Bird> birds = new ArrayList<>();

        birds.add(new Bird("Parrot", "Psittaciformes"));
        birds.add(new Bird("Gadwall", "Anas strepera "));
        birds.add(new Bird("Mallard", "Anas platyrhynchos "));
        birds.add(new Bird("Redhead", "Aythya americana "));
        birds.add(new Bird("Bufflehead", "Bucephala albeola"));
        birds.add(new Bird("Owl", "Bubo virginianus "));

        return birds;

    }



}
