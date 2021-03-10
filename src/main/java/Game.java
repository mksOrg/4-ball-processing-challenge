import models.Ball;
import models.Box;
import models.Shape;
import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class Game extends PApplet {

    // CONSTANTS DECLARATION
    public static final int WIDTH = 1200;
    public static final int HEiGHT = 720;
    public static final int DIAMETER = 20;
    public static final int SPEED = 2;
    public static final int SIDE = 20;

    private List<Shape> shapes;
    private static Shape ball1;
    private static Shape ball2;
    private static Shape box;
    private static Shape ball4;

    public static void main(String[] args) {
        PApplet.main("Game", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEiGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(0, HEiGHT, DIAMETER, SPEED, 1);
        ball2 = new Ball(0, HEiGHT, DIAMETER, SPEED, 2);
        box = new Box(0, HEiGHT, SIDE, SPEED, 3);
        ball4 = new Ball(0, HEiGHT, DIAMETER, SPEED, 4);
        shapes = Arrays.asList(ball1, ball2, box, ball4);
    }

    @Override
    public void draw() {
        shapes.forEach(Shape::move);
        shapes.forEach(ball -> ball.draw(this));
    }


}
