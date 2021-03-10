package models;

import processing.core.PApplet;

public class Ball implements Shape {
    private int xCoordinate;
    private int yCoordinate;
    private int diameter;
    private int speed;

    public Ball(int xCoordinate, int yCoordinate, int diameter, int speed, int level){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = (yCoordinate * level) / 5;
        this.diameter = diameter;
        this.speed = speed * level;
    }

    @Override
    public void move() {
        xCoordinate+=speed;
    }

    @Override
    public void draw(PApplet pApplet){
        pApplet.ellipse(xCoordinate, yCoordinate, diameter, diameter);
    }
}
