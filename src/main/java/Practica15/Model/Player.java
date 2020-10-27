package Practica15.Model;

public class Player {

    private int xPos;
    private int yPos;
    private int minX;
    private int minY;
    private int maxX;
    private int maxY;

    public Player(int xPos, int yPos, int minX, int minY, int maxX, int maxY) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public Player(int xPos, int yPos, int maxX, int maxY) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.maxX = maxX;
        this.maxY = maxY;
    }
    public void moveLeftRestriction(){
        if(this.minX<getxPos()){
            this.moveLeft();
        }
    }
    public void moveRightRestriction(){
        if(this.minY<getyPos()){
            this.moveDown();
        }
    }
    public void moveUpRestriction(){
        if(this.maxX>getxPos()){
            this.moveRight();
        }
    }
    public void moveDownRestriction(){
        if(this.maxY>getyPos()){
            this.moveUp();
        }
    }

    public void moveLeft() {
        xPos--;
    }

    public void moveRight(){
        xPos++;
    }
    public void moveUp() {
        yPos++;
    }

    public void moveDown(){
        yPos--;
    }

    public int getyPos() {
        return yPos;
    }

    public int getxPos() {
        return xPos;
    }
}
