package Practica13.Controller;

import Practica13.Service.AirplanesDB;
import Practica13.Utils.StringUtils;

import java.util.Scanner;

public class FlightServicePanel {

    private Scanner scan;
    private AirplanesDB airplanesDB;

    public FlightServicePanel() {
        this.scan = new Scanner(System.in);
        this.airplanesDB = new AirplanesDB();
    }

    public void printOptions(){
        System.out.println("Choose an option to proceed:");
        System.out.println("[1] Print Airplanes List");
        System.out.println("[2] Print Flights List");
        System.out.println("[3] Print Airplane");
        System.out.println("[x] Return");
    }
    public void flightPanelLoop(){
        System.out.println("Welcome to the Flight Service Panel!");
        while(true){
            printOptions();
            String command = scan.nextLine();
            if(StringUtils.included(command, "1")){
                airplanesDB.printAirplanesList();
            }else if(StringUtils.included(command, "2")){
                airplanesDB.printAirplanesListWithFlights();
            }else if(StringUtils.included(command, "3")){
                System.out.println("Introduce the airplane you want to print: ");
                String airplaneName = scan.nextLine();
                if(airplanesDB.checkAirplaneInDB(airplaneName)){
                    airplanesDB.airplaneFor(airplanesDB.getAirplanes(),airplaneName).printAirplane();
                }else{
                    System.out.println("There's no airplane in the DB with that name, try again please.");
                }
            }else if(StringUtils.included(command, "x")){
                return;
            }else{
                System.out.println("Unknown command.");
            }
        }

    }
}
