package pattern.builder.builder.concrete;

import pattern.builder.builder.AirplaneBuilder;

public class FighterJet extends AirplaneBuilder {
    public FighterJet(String customer) {
        super.customer = customer;
        super.type = "F-35 Lightning II";
    }

    public void buildWings() {
        airplane.setWingspan(35.0f);
    }

    public void buildPowerplant() {
        airplane.setPowerPlant("dual thrust vectoring");
    }

    public void buildAvionics() {
        airplane.setAvionics("military");
    }

    public void buildSeats() {
        airplane.setNumberSeats(1, 0);
    }
}
