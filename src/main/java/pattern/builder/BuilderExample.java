package pattern.builder;

import pattern.builder.builder.AirplaneBuilder;
import pattern.builder.builder.concrete.CropDuster;
import pattern.builder.builder.concrete.FighterJet;
import pattern.builder.builder.concrete.Glider;
import pattern.builder.director.AerospaceEngineer;
import pattern.builder.product.Airplane;

public class BuilderExample {
    public static void main(String[] args) {
        // instantiate the director (hire the engineer)
        // 1. client에서 사용할 director를 먼저 생성한다.
        AerospaceEngineer aero = new AerospaceEngineer();

        // instantiate each concrete builder (take orders)
        // 2. director에서 사용할 builder들에 대해 생성한다.
        AirplaneBuilder crop = new CropDuster("Farmer Joe");
        AirplaneBuilder fighter = new FighterJet("The Navy");
        AirplaneBuilder glider = new Glider("Tim Rice");

        // build a CropDuster
        // 3. director 에서 상황에 맞게 builder 를 선택해서 product 를 만든다.
        aero.setAirplaneBuilder(crop);
        // aero.setAirplaneBuilder(fighter);
        // aero.setAirplaneBuilder(glider);
        aero.constructAirplane();

        Airplane completedCropDuster = aero.getAirplane();
        System.out.println(completedCropDuster.getType() +
                " is completed and ready for delivery to " +
                completedCropDuster.getCustomer());
    }

}
