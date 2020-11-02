package Practica15.View;


import Practica15.Controller.Dungeon;
import Practica15.Model.Player;
import Practica15.Model.Vampire;
import Practica15.Service.VampireDB;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        VampireDB vampireDB = new VampireDB();
        int vampires = 4;
        int moves = 10;
        boolean vampiresMove = false;


        Player player = new Player(5,0);
        Vampire vampire = new Vampire(0,6, false);
        Vampire vampire1 = new Vampire(4,4, false);
        Vampire vampire2 = new Vampire(3,2, false);
        Vampire vampire3 = new Vampire(2,5, false);

        vampireDB.getVampires().add(vampire);
        vampireDB.getVampires().add(vampire1);
        vampireDB.getVampires().add(vampire2);
        vampireDB.getVampires().add(vampire3);
        //int length, int height, int vampires, int moves, boolean vampiresMove
        int height = 10;
        int width = 20;
        String [][]board = new String[height][width];

        Dungeon dungeon = new Dungeon(width, height, vampires,moves,vampiresMove);

        for(int i = 0; i< height; i++){
            for(int j = 0; j< width; j++){
                board[i][j] = ".";

            }
        }
//MOVE VAMPIRES AT FINAL
        board[player.getxPos()][player.getyPos()] = Player.VALUE_PLAYER;
        board[vampire.getxPos()][vampire.getyPos()] = Vampire.VALUE_VAMPIRE;
        board[vampire1.getxPos()][vampire1.getyPos()] = Vampire.VALUE_VAMPIRE;
        board[vampire2.getxPos()][vampire2.getyPos()] = Vampire.VALUE_VAMPIRE;
        board[vampire3.getxPos()][vampire3.getyPos()] = Vampire.VALUE_VAMPIRE;

        for(int i = 0; i< height; i++){
            for(int j = 0; j< width; j++){
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
        while(dungeon.getMoves()>0){
            System.out.println("Give your moves");
            String command = scan.nextLine();
            for(int k = 0; k<command.length();k++){
                switch (command.charAt(k)){
                    case 'w':
                        if(player.getxPos() ==0){

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
                        break;
                    case 'a':
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

                        break;
                    case 's':
                        if(player.getxPos()==dungeon.getHeight()){

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
                        break;
                    case 'd':
                        if(player.getyPos()==dungeon.getWidth()){

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
                        break;
                }
                for(int i = 0; i< height; i++){
                    for(int j = 0; j< width; j++){
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
}
