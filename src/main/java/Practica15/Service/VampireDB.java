package Practica15.Service;

import Practica15.Controller.MoveOptions;
import Practica15.Model.Dungeon;
import Practica15.Model.Vampire;

import java.util.ArrayList;
import java.util.Random;

import static Practica15.Controller.MoveOptions.board;

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
            board[getVampires().get(i).getxPos()][getVampires().get(i).getyPos()] = ".";
            if(getVampires().get(i).getxPos()==0){
                getVampires().get(i).vampireMoveDown();

            }else{
                getVampires().get(i).vampireMoveUp();
            }
            board[getVampires().get(i).getxPos()][getVampires().get(i).getyPos()] = Vampire.VALUE_VAMPIRE;
        }

    }
    public void vampireMoveDown(Dungeon dungeon){
        for(int i = 0; i<getVampires().size(); i++){
            board[getVampires().get(i).getxPos()][getVampires().get(i).getyPos()] = ".";
            if(getVampires().get(i).getxPos()==dungeon.getWidth()-1){
                getVampires().get(i).vampireMoveUp();
            }else{
                getVampires().get(i).vampireMoveDown();
            }
            board[getVampires().get(i).getxPos()][getVampires().get(i).getyPos()] = Vampire.VALUE_VAMPIRE;
        }
    }
    public void vampireMoveLeft (){
        for(int i = 0; i<getVampires().size(); i++){
            board[getVampires().get(i).getxPos()][getVampires().get(i).getyPos()] = ".";
            if(getVampires().get(i).getyPos()==0){
                getVampires().get(i).vampireMoveRight();
            }else{
                getVampires().get(i).vampireMoveLeft();
            }
            board[getVampires().get(i).getxPos()][getVampires().get(i).getyPos()] = Vampire.VALUE_VAMPIRE;
        }
    }
    public void vampireMoveRight(Dungeon dungeon){
        for(int i = 0; i<getVampires().size(); i++){
            board[getVampires().get(i).getxPos()][getVampires().get(i).getyPos()] = ".";

            if(getVampires().get(i).getyPos()==dungeon.getHeight()-1){
                getVampires().get(i).vampireMoveLeft();
            }else{
                getVampires().get(i).vampireMoveRight();
            }
            board[getVampires().get(i).getxPos()][getVampires().get(i).getyPos()] = Vampire.VALUE_VAMPIRE;
        }
    }

    public ArrayList<Vampire> getVampires() {
        return vampires;
    }
}