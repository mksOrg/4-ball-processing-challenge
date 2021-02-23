import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 720;
    public static final int DIAMETER = 30;
    public static final int SPEED = 4;
    int ball_1_x = 0; // Ball 1 X coordinate
    int ball_2_x = 0; // Ball 2 X coordinate
    int ball_3_x = 0; // Ball 3 X coordinate
    int ball_4_x = 0; // Ball 4 X coordinate

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() { }

    @Override
    public void draw() {
        drawCircle(ball_1_x, orientationLevel(1));
        drawCircle(ball_2_x, orientationLevel(2));
        drawCircle(ball_3_x , orientationLevel( 3));
        drawCircle(ball_4_x, orientationLevel( 4));

        moveBallls();
    }

    private int orientationLevel(int level) {
        return (HEIGHT * level) / 5;
    }

    private void moveBallls() {
        ball_1_x+=SPEED;
        ball_2_x+=(SPEED * 2);
        ball_3_x+=(SPEED * 3);
        ball_4_x+=(SPEED * 4);
    }

    private void drawCircle(int width, int height) {
        ellipse(width, height, DIAMETER, DIAMETER);
    }
}
