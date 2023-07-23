package Creational.Factory;

public class Pepporoni implements Pizza {
    String description="Peporoni";
    @Override
    public void createPizza() {
        System.out.println("Creating"+" "+description+" "+description);
    }

    @Override
    public void packPizza() {
        System.out.println("Packing"+" "+description+" "+description);
    }


}
