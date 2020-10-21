package Practica12.Model;

public class Apartment {
    private String address;
    private int nRooms;
    private int meters;
    private int pricePerMonth;

    public Apartment(String address) {
        this.address = address;
    }

    public Apartment(String address, int nRooms, int pricePerMonth) {
        this.address = address;
        this.nRooms = nRooms;
        this.pricePerMonth = pricePerMonth;
    }

    public Apartment(String address, int nRooms, int meters, int pricePerMonth) {
        this.address = address;
        this.nRooms = nRooms;
        this.meters = meters;
        this.pricePerMonth = pricePerMonth;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "address='" + address + '\'' +
                ", nRooms=" + nRooms +
                ", meters=" + meters +
                ", pricePerMonth=" + pricePerMonth +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getnRooms() {
        return nRooms;
    }

    public void setnRooms(int nRooms) {
        this.nRooms = nRooms;
    }

    public int getMeters() {
        return meters;
    }

    public void setMeters(int meters) {
        this.meters = meters;
    }

    public int getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerMonth(int pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }
}
