package practice.composite.test_lab;

public class Impl2 extends Implementor {

    public Impl2(int x, int y, int wigth, int height, int color) {
        super(x, y, wigth, height, color);
    }

    public void draw() {
        System.out.println("Imp2.draw()");
    }

    public void move(int newX, int newY) {
        System.out.println("Imp2.move()");
    }

}
