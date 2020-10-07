package Practica5;

public class Home {
    public String houseColor;
    public String manyDoors;
    public int m2;

    @Override
    public String toString() {
        return "Home{" +
                "houseColor='" + houseColor + '\'' +
                ", manyDoors='" + manyDoors + '\'' +
                ", m2=" + m2 +
                '}';
    }

    public String getManyDoors() {
        return manyDoors;
    }

    public void setManyDoors(String manyDoors) {
        this.manyDoors = manyDoors;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public String getHouseColor() {
        return houseColor;
    }

    public void setHouseColor(String houseColor) {
        this.houseColor = houseColor;
    }
}
