package Practica13.Service;

import Practica13.Model.Airplane;

import java.util.ArrayList;

public class AirplanesDB {

    private ArrayList<Airplane> airplanes;

    public AirplanesDB() {
        this.airplanes = new ArrayList<>();
    }

    public boolean checkAirplaneInDB(String airplane){
        for (Airplane airplane1: this.airplanes) {
            if(airplane1.getID().toLowerCase().equalsIgnoreCase(airplane.toLowerCase())){
                return true;
            }
        }
        return false;
    }
    public void printAirplanesList(){
        for (Airplane airplane: this.airplanes) {
            airplane.printAirplane();
        }
    }
    public void printAirplanesListWithFlights(){
        for(Airplane airplane: this.airplanes){
            airplane.printAirplaneAndFlights();
        }
    }
    public Airplane airplaneFor(ArrayList<Airplane> airplanes, String airplaneName){
        for (Airplane airplane: airplanes) {
            if(airplane.getID().toLowerCase().equalsIgnoreCase(airplaneName.toLowerCase()))
                return airplane;
        }
        return null;
    }


    @Override
    public String toString() {
        return "Airplanes{" +
                "airplanes=" + airplanes +
                '}';
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
}
