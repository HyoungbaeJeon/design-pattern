package structural.bridge;

public abstract class Shape {
    abstract public void draw();
    private Drawing _dp;
    Shape (Drawing dp) {
        _dp = dp;
    }
    public void drawLine (double x1, double y1, double x2, double y2) {
        _dp.drawLine(x1,y1,x2,y2);
    }
    public void drawCircle (double x, double y, double r) {
        _dp.drawCircle(x,y,r);
    }
}
