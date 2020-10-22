package Practica13.Service;

import Practica13.Model.Airplane;

import java.util.ArrayList;

public class AirplanesDB {

    private ArrayList<Airplane> airplanes;

    public AirplanesDB() {
        this.airplanes = new ArrayList<>();
    }

    public boolean checkAirplaneInDB(String airplane){
        for (Airplane airplane1: getAirplanes()) {
            if(airplane1.getID().toLowerCase().equalsIgnoreCase(airplane.toLowerCase())){
                return true;
            }
        }
        return false;
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
