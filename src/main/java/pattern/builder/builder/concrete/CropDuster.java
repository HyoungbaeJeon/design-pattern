package pattern.builder.builder.concrete;

import pattern.builder.builder.AirplaneBuilder;

public class CropDuster extends AirplaneBuilder {
    public CropDuster(String customer) {
        super.customer = customer;
        super.type = "Crop Duster v3.4";
    }

    public void buildWings() {
        airplane.setWingspan(9f);
    }

    public void buildPowerplant() {
        airplane.setPowerPlant("single piston");
    }

    public void buildAvionics() {
    }

    public void buildSeats() {
        airplane.setNumberSeats(1, 1);
    }
}

