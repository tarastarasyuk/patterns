package bridge.secondImpl;

public class BridgeTest {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();

        pent = new Pentagon(new BlackColor());
        pent.applyColor();
    }
}
