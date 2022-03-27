package structural.bridge;

public class V2Drawing extends Drawing {
    public void drawLine(double x1, double y1, double x2, double y2) {
        System.out.println("DP2.draw_a_line(x1,y1,x2,y2);");
    }

    public void drawCircle(double x, double y, double r) {
        System.out.println("DP2.draw_a_circle(x,y,r);");
    }
}
