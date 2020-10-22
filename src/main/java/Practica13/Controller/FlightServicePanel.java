package Practica13.Controller;

import Practica13.Service.AirplanesDB;

import java.util.Scanner;

public class FlightServicePanel {

    private Scanner scan;
    private AirplanesDB airplanesDB;

    public FlightServicePanel() {
        this.scan = new Scanner(System.in);
        this.airplanesDB = new AirplanesDB();
    }
    public void flightPanelLoop(){

    }
}
