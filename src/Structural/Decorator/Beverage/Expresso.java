package Structural.Decorator.Beverage;

public class Expresso extends Beverage {

    public Expresso(){
        description="Expressor";
    }

    @Override
    public double cost() {
        return 1.23;
    }
}
