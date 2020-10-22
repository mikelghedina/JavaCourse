package Practica13.Controller;


import Practica13.Model.Airplane;
import Practica13.Service.AirplanesDB;
import Practica13.Utils.StringUtils;

import java.util.Scanner;

public class AirportPanel {

    private Scanner scan;
    private AirplanesDB airplanesDB;


    public AirportPanel() {
        this.scan = new Scanner(System.in);
        this.airplanesDB = new AirplanesDB();
    }

    public void printOptions(){
        System.out.println("Choose an option to proceed:");
        System.out.println("[1] Add Airplane");
        System.out.println("[2] Add Flight");
        System.out.println("[x] Return");
    }
    public void airportPanelLoop(){
        System.out.println("Welcome to this airport manager!");
        while(true){
            printOptions();
            String command = scan.nextLine();

            if(StringUtils.included(command,"1")){
                System.out.println("Write the airplane name: ");
                String airplaneName = scan.nextLine();
                System.out.println("Its capacity: ");
                int passengersCapacity = Integer.parseInt(scan.nextLine());

                airplanesDB.getAirplanes().add(new Airplane(airplaneName,passengersCapacity));
                System.out.println("Airplane stored to the DB successfully!");

            }else if(StringUtils.included(command, "2")){
                System.out.println("Introduce an airplane: ");
                String airplaneName = scan.nextLine();

                if(airplanesDB.checkAirplaneInDB(airplaneName)){
                    System.out.println("Introduce the airport destinations code: ");
                    String airportDestinationCode = scan.nextLine();
                    System.out.println("Introduce the airport outs code: ");
                    String airportOutCode = scan.nextLine();
                    airplanesDB.airplaneFor(airplanesDB.getAirplanes(), airplaneName).addFlightsToAirplane(airportDestinationCode,airportOutCode);
                }else{
                    System.out.println("Unknown airplane.");
                }

            }else if(StringUtils.included(command,"x")){
                return;

            }else{
                System.out.println("Unknown command.");
                return;
            }
        }
    }

    public AirplanesDB getAirplanesDB() {
        return airplanesDB;
    }

    public void setAirplanesDB(AirplanesDB airplanesDB) {
        this.airplanesDB = airplanesDB;
    }

}
