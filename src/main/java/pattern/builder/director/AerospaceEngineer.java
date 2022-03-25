package pattern.builder.director;

import pattern.builder.builder.AirplaneBuilder;
import pattern.builder.product.Airplane;

public class AerospaceEngineer {
    private AirplaneBuilder airplaneBuilder;

    public void setAirplaneBuilder(AirplaneBuilder ab) {
        airplaneBuilder = ab;
    }

    public Airplane getAirplane() {
        return airplaneBuilder.getAirplane();
    }

    public void constructAirplane() {
        airplaneBuilder.createNewAirplane();
        airplaneBuilder.buildWings();
        airplaneBuilder.buildPowerplant();
        airplaneBuilder.buildAvionics();
        airplaneBuilder.buildSeats();
    }
}

