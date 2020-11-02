package Practica15.Model;

public class Vampire {


    private int xPos;
    private int yPos;
    private boolean isDead;
    public static final String VALUE_VAMPIRE = "v";

    public Vampire(int xPos, int yPos, boolean isDead) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.isDead = isDead;
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

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
