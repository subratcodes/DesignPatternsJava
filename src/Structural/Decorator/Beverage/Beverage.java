package Structural.Decorator.Beverage;

public abstract class Beverage {

    String description="Unknown";

    public String getDescription(){
        return description;
    }


    //these methods need to be implemented in the
    public abstract double cost();


}
