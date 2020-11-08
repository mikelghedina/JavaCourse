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

    public void vampireMoveUp(){
        setxPos(getxPos()-1);
    }
    public void vampireMoveDown(){
        setxPos(getxPos()+1);
    }
    public void vampireMoveRight(){
        setyPos(getyPos()+1);
    }
    public void vampireMoveLeft(){
        setyPos(getyPos()-1);
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
        this.xPos= xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
