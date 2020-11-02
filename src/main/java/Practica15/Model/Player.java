package Practica15.Model;

public class Player {

    private int xPos;
    private int yPos;
    public static final String VALUE_PLAYER = "@";

    public Player(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "Player{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
