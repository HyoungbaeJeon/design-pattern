package structural.decorator.beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    public double cost() {
        return 3.99;
    }
}
