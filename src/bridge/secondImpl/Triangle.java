package bridge.secondImpl;

public class Triangle extends Shape{
//    private String color;

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        super.color.applyColor();
    }
}
