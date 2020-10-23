package Practica13.Controller;

import Practica13.Utils.StringUtils;

import java.util.Scanner;

public class BigController {

    private Scanner scan ;
    private AirportPanel airportPanel;
    private FlightServicePanel flightServicePanel;

    public BigController() {
        this.scan = new Scanner(System.in);
        this.airportPanel = new AirportPanel();
        //this.flightServicePanel = new FlightServicePanel(this.airportPanel);
    }

    public void startConsoleLoop(){
        System.out.println("Welcome to this platform");
        while(true){
            System.out.println("Choose an option:");
            System.out.println("[1] Enter Airport Panel");
            System.out.println("[2] Enter Flight Service Panel");
            System.out.println("[x] Exit Application");
            String command = scan.nextLine();

            if(StringUtils.included(command, "1")){
                airportPanel.airportPanelLoop();
            }
            else if(StringUtils.included(command, "2")){
                flightServicePanel.flightPanelLoop();
            }else if(StringUtils.included(command, "x")){
                return;
            }
            else{
                System.out.println("Unknown command.");
            }
        }
    }
}
