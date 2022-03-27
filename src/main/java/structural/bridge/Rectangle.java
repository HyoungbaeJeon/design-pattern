package structural.bridge;

public class Rectangle extends Shape {
    private final double _x1;
    private final double _x2;
    private final double _y1;
    private final double _y2;

    public Rectangle(Drawing dp, double x1, double y1, double x2, double y2) {
        super(dp);
        _x1 = x1;
        _x2 = x2;
        _y1 = y1;
        _y2 = y2;
    }

    public void draw() {
        drawLine(_x1, _y1, _x2, _y1);
        drawLine(_x2, _y1, _x2, _y2);
        drawLine(_x2, _y2, _x1, _y2);
        drawLine(_x1, _y2, _x1, _y1);
    }

}

