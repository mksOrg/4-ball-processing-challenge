package models;

import processing.core.PApplet;

public class Box implements Shape{

    private int xCoordinate;
    private int yCoordinate;
    private int speed;
    private int side;

    public Box(int xCoordinate, int yCoordinate, int side, int speed, int level){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = (yCoordinate * level) / 5;
        this.speed = speed * level;
        this.side = side;
    }
    @Override
    public void draw(PApplet pApplet) {
        pApplet.rect(xCoordinate, yCoordinate, side, side);
    }

    @Override
    public void move() {
        xCoordinate +=speed;
    }
}
