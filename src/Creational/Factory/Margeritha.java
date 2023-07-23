package Creational.Factory;

public class Margeritha implements Pizza {
    String description="Margeritha";

    @Override
    public void createPizza() {
        System.out.println("Creating"+" "+description+" "+description);
    }

    @Override
    public void packPizza() {
        System.out.println("Packing "+description+" pizza");
    }
}
