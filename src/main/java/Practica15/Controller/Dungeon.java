package Practica15.Controller;

public class Dungeon {

    private int width;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;

    public Dungeon(int width, int height, int vampires, int moves, boolean vampiresMove) {
        this.width = width;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVampires() {
        return vampires;
    }

    public void setVampires(int vampires) {
        this.vampires = vampires;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public boolean isVampiresMove() {
        return vampiresMove;
    }

    public void setVampiresMove(boolean vampiresMove) {
        this.vampiresMove = vampiresMove;
    }
}
