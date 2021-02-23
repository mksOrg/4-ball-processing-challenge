package models;

public class Ball {
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

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getxCoordinate() {
        return xCoordinate;
    }
    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    public int getyCoordinate() {
        return yCoordinate;
    }
    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    public int getDiameter() {
        return diameter;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public void moveLeftToRight() {
        xCoordinate+=speed;
    }

}
