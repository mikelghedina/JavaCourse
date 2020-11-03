package Practica10.Controller;

import Practica10.Service.BirdsDatabase;

import java.util.Scanner;

import static Practica10.Utils.Utils.*;

public class Menu {

    private final Scanner scan;
    private BirdsDatabase db;

    public Menu() {
        this.scan = new Scanner(System.in);
        this.db = new BirdsDatabase();
    }

    public void loop (){
        menu();


        while(true){
            String command = ask(scan, "Option?");

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add(scan,getDatabase());
            } else if (command.equals("Observation")) {
                observation(scan,getDatabase());
            } else if (command.equals("Show")) {
                show(scan,getDatabase());
            } else if (command.equals("Statistics")) {
                statistics(getDatabase());
            }else if(command.equals("Menu")){
                menu();
            }else {
                System.out.println("Unknown command!");
            }
        }
    }

    public BirdsDatabase getDatabase() {
        return db;
    }

    public void setDatabase(BirdsDatabase database) {
        this.db = database;
    }
}
