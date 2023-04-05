package edu.eci.arsw.bomberman.model;

public class Bomb implements elem{
    private int x;
    private int y;

    public Bomb(int x, int y){
        place(x,y);
    }

    public void explode() {
        this.x = -1;
        this.y = -1;
    }

    @Override
    public void place(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
