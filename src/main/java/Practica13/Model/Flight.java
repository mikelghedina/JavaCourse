package Practica13.Model;

public class Flight {
    private String destinationAirportCode;
    private String outsAirportCode;

    public Flight(String destinationAirportCode, String outsAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
        this.outsAirportCode = outsAirportCode;
    }
    public void printFlight(){
        System.out.println(" Destination Airport Code: " + destinationAirportCode + "\tOuts Airport Code: " + outsAirportCode);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "destinationAirportCode='" + destinationAirportCode + '\'' +
                ", outsAirportCode='" + outsAirportCode + '\'' +
                '}';
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public String getOutsAirportCode() {
        return outsAirportCode;
    }

    public void setOutsAirportCode(String outsAirportCode) {
        this.outsAirportCode = outsAirportCode;
    }
}
