package structural.bridge;

public class Circle extends Shape {
    private final double _x;
    private final double _y;
    private final double _r;

    public Circle(Drawing dp, double x, double y, double r) {
        super(dp);
        _x = x;
        _y = y;
        _r = r;
    }

    public void draw() {
        drawCircle(_x, _y, _r);
    }
}
