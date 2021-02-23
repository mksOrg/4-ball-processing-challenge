import models.Ball;
import processing.core.PApplet;

public class TryProcessing extends PApplet {

    // CONSTANTS DECLARATION
    public static final int WIDTH = 1200;
    public static final int HEiGHT = 720;
    public static final int DIAMETER = 20;
    public static final int SPEED = 2;

    private static Ball ball1;
    private static Ball ball2;
    private static Ball ball3;
    private static Ball ball4;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
        initialization();
    }

    @Override
    public void settings() {
        size(WIDTH, HEiGHT);
    }

    @Override
    public void draw() {
        drawBalls();
        moveBalls();
    }

    private static void initialization() {
        ball1 = new Ball(0, HEiGHT, DIAMETER, SPEED, 1);
        ball2 = new Ball(0, HEiGHT, DIAMETER, SPEED, 2);
        ball3 = new Ball(0, HEiGHT, DIAMETER, SPEED, 3);
        ball4 = new Ball(0, HEiGHT, DIAMETER, SPEED, 4);
    }

    private void drawBalls() {
        ellipse(ball1.getxCoordinate(), ball1.getyCoordinate(), ball1.getDiameter(), ball1.getDiameter());
        ellipse(ball2.getxCoordinate(), ball2.getyCoordinate(), ball2.getDiameter(), ball2.getDiameter());
        ellipse(ball3.getxCoordinate(), ball3.getyCoordinate(), ball3.getDiameter(), ball3.getDiameter());
        ellipse(ball4.getxCoordinate(), ball4.getyCoordinate(), ball4.getDiameter(), ball4.getDiameter());
    }

    private void moveBalls() {
        ball1.moveLeftToRight();
        ball2.moveLeftToRight();
        ball3.moveLeftToRight();
        ball4.moveLeftToRight();
    }

}
