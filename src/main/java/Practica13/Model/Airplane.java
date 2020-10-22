package Practica13.Model;

import java.util.ArrayList;

public class Airplane {
    private String ID;
    private int passengersCapacity;
    private ArrayList<Flight> flights;

    public Airplane(String ID, int passengersCapacity) {
        this.ID = ID;
        this.passengersCapacity = passengersCapacity;
    }

    public void addFlightsToAirplane(String destinationCode,String outCode){
        this.flights = new ArrayList<>();
        getFlights().add(new Flight(destinationCode, outCode));
    }
    public void printAirplane(){
        System.out.println("ID: " + this.ID + "\nCapacity: ");
    }
    public void printAirplaneAndFlights(){
        System.out.println("ID: " + this.ID + "\nCapacity: "); flightsFor(this.flights).printFlight();
    }
    public Flight flightsFor(ArrayList<Flight> flights){
        for (Flight flight: flights) {
            return flight;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "ID='" + ID + '\'' +
                ", passengersCapacity=" + passengersCapacity +
                ", flightsDBs=" +  +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
}
