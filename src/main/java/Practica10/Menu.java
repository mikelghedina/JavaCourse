package Practica10;

import java.util.Scanner;

import static Practica10.Utils.*;

public class Menu {

    private Scanner scan;
    private BirdsDatabase db;

    public void loop (){
        menu();

        while(true){
            String command = ask(scan, "Option?");

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add(scan,db);
            } else if (command.equals("Observation")) {
                observation(scan,db);
            } else if (command.equals("Show")) {
                show(scan,db);
            } else if (command.equals("Statistics")) {
                statistics(db);
            }else if(command.equals("Menu")){
                menu();
            }else {
                System.out.println("Unknown command!");
            }
        }
    }

    public Menu(Scanner scan, BirdsDatabase database) {
        this.scan = scan;
        this.db = database;
    }

    public BirdsDatabase getDatabase() {
        return db;
    }

    public void setDatabase(BirdsDatabase database) {
        this.db = database;
    }
}
