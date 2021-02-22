import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        System.out.println("Printed from the settings()");
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        System.out.println("Printed from the setup()");
    }

    @Override
    public void draw() {
        getBackground();
        drawCircle();
    }

    private void drawCircle() {
        ellipse(mouseX, mouseY,DIAMETER, DIAMETER);
    }

    private void getBackground() {
        background(255);
    }
}
