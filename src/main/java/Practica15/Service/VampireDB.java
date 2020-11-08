package Practica15.Service;

import Practica15.Model.Dungeon;
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
            getVampires().add(new Vampire(random.nextInt(width), random.nextInt(height), false));
        }
    }

    public void vampireMoveUp(){
        for(int i = 0; i<getVampires().size(); i++){
            if(getVampires().get(i).getxPos()==0){
                getVampires().get(i).vampireMoveDown();
            }else{
                getVampires().get(i).vampireMoveUp();
            }
        }

    }
    public void vampireMoveDown(Dungeon dungeon){
        for(int i = 0; i<getVampires().size(); i++){
            if(getVampires().get(i).getxPos()==dungeon.getWidth()){
                getVampires().get(i).vampireMoveUp();
            }else{
                getVampires().get(i).vampireMoveDown();
            }
        }
    }
    public void vampireMoveLeft (){
        for(int i = 0; i<getVampires().size(); i++){
            if(getVampires().get(i).getyPos()==0){
                getVampires().get(i).vampireMoveRight();
            }else{
                getVampires().get(i).vampireMoveLeft();
            }
        }
    }
    public void vampireMoveRight(Dungeon dungeon){
        for(int i = 0; i<getVampires().size(); i++){
            if(getVampires().get(i).getyPos()==dungeon.getHeight()){
                getVampires().get(i).vampireMoveLeft();
            }else{
                getVampires().get(i).vampireMoveRight();
            }
        }
    }

    public ArrayList<Vampire> getVampires() {
        return vampires;
    }
}