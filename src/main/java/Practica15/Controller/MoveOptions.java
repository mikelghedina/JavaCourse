package Practica15.Controller;

import Practica15.Model.Dungeon;
import Practica15.Model.Player;
import Practica15.Model.Vampire;
import Practica15.Service.VampireDB;

import java.util.Random;
import java.util.Scanner;

public class MoveOptions {

    private Random random;
    private Dungeon dungeon;
    private Player player;
    private VampireDB vampireDB;
    private String [][] board;

    public MoveOptions(int width, int height, int vampires, int moves, boolean vampiresMove) {
        this.dungeon = new Dungeon(width, height, vampires, moves, vampiresMove);
        this.player = new Player(0,0);
        this.vampireDB = new VampireDB();
        vampireDB.addVampires(vampires, width,height);
        this.board = new String [width][height];
        this.random = new Random();
    }

    public void loop(){
        for(int i = 0; i< dungeon.getHeight(); i++){
            for(int j = 0; j< dungeon.getWidth(); j++){
                board[i][j] = ".";

            }
        }

        board[player.getxPos()][player.getyPos()] = Player.VALUE_PLAYER;
        for(int l = 0; l<vampireDB.getVampires().size(); l++){
            board[vampireDB.getVampires().get(l).getxPos()][vampireDB.getVampires().get(l).getyPos()] = Vampire.VALUE_VAMPIRE;
        }

        for(int i = 0; i< dungeon.getHeight(); i++){
            for(int j = 0; j< dungeon.getWidth(); j++){
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }

        Scanner scan = new Scanner(System.in);
        while(dungeon.getMoves()>0){

            System.out.println("Give your moves");
            String command = scan.nextLine();
            for(int k = 0; k<command.length();k++){
                switch (command.charAt(k)){
                    case 'w':
                        moveUp();
                        break;
                    case 'a':
                        moveLeft();
                        break;
                    case 's':
                        moveDown();
                        break;
                    case 'd':
                        moveRight();
                        break;
                }
                for(int i = 0; i< dungeon.getHeight(); i++){
                    for(int j = 0; j< dungeon.getWidth(); j++){
                        System.out.print(board[i][j]);
                    }
                    System.out.print("\n");
                }

                if(dungeon.getVampires()== 0){
                    System.out.println("You win.");
                    return;
                }
            }
            dungeon.setMoves(dungeon.getMoves()-1);
        }
        System.out.println("You loose.");
    }


    public void moveUp(){
        if(this.player.getxPos() ==0){

        }else{
            for(int l = 0; l< vampireDB.getVampires().size(); l++){
                if(!vampireDB.getVampires().get(l).isDead()){
                    if(player.getxPos()-1== vampireDB.getVampires().get(l).getxPos() &&
                            player.getyPos() == vampireDB.getVampires().get(l).getyPos()){
                        vampireDB.getVampires().get(l).setDead(true);
                        dungeon.setVampires(dungeon.getVampires()-1);
                    }
                }
            }
            board[player.getxPos()][player.getyPos()] = ".";
            player.setxPos(player.getxPos()-1);
            board[player.getxPos()][player.getyPos()] = Player.VALUE_PLAYER;


        }
    }
    public void moveLeft(){

        if(player.getyPos()==0){

        }else{
            for(int l = 0; l< vampireDB.getVampires().size(); l++){
                if(!vampireDB.getVampires().get(l).isDead()){
                    if(player.getxPos()== vampireDB.getVampires().get(l).getxPos() &&
                            player.getyPos() -1== vampireDB.getVampires().get(l).getyPos()){
                        vampireDB.getVampires().get(l).setDead(true);
                        dungeon.setVampires(dungeon.getVampires()-1);
                    }
                }
            }
            board[player.getxPos()][player.getyPos()] = ".";
            player.setyPos(player.getyPos()-1);
            board[player.getxPos()][player.getyPos()] = Player.VALUE_PLAYER;
        }

    }
    public void moveDown(){
        if(player.getxPos()==dungeon.getWidth()-1){

        }else{
            for(int l = 0; l< vampireDB.getVampires().size(); l++){
                if(!vampireDB.getVampires().get(l).isDead()){
                    if(player.getxPos()== vampireDB.getVampires().get(l).getxPos() &&
                            player.getyPos() +1== vampireDB.getVampires().get(l).getyPos()){
                        vampireDB.getVampires().get(l).setDead(true);
                        dungeon.setVampires(dungeon.getVampires()-1);
                    }
                }
            }
            board[player.getxPos()][player.getyPos()] = ".";
            player.setxPos(player.getxPos()+1);
            board[player.getxPos()][player.getyPos()] = Player.VALUE_PLAYER;
        }
    }
    public void moveRight(){
        if(player.getyPos()==dungeon.getHeight()-1){

        }else{
            for(int l = 0; l< vampireDB.getVampires().size(); l++){
                if(!vampireDB.getVampires().get(l).isDead()){
                    if(player.getxPos() +1== vampireDB.getVampires().get(l).getxPos() &&
                            player.getyPos()== vampireDB.getVampires().get(l).getyPos()){
                        vampireDB.getVampires().get(l).setDead(true);
                        dungeon.setVampires(dungeon.getVampires()-1);
                    }
                }
            }
            board[player.getxPos()][player.getyPos()] = ".";
            player.setyPos(player.getyPos()+1);
            board[player.getxPos()][player.getyPos()] = Player.VALUE_PLAYER;
        }
    }
}
