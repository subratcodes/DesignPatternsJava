package Structural.Decorator.Condiments;

import Structural.Decorator.Beverage.Beverage;

public class SoyMilk extends Condiments {
   Beverage beverage;

    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Soy Milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }
}
