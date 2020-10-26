package Practica15.Model;

public class Vampire {


    private int xPos;
    private int yPos;



    public Vampire(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "Vampire{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        xPos--;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        yPos++;
    }
}
