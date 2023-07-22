package Structural.Decorator.Beverage;

public class HouseBlen extends Beverage {

    public HouseBlen(){
        description="HouseBlend";

    }

    @Override
    public double cost() {
        return 1.29;
    }


}
