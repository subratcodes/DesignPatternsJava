package Creational.Factory;

public class PizzaStore {
    PizzaFactory factory;
    public PizzaStore(){
        factory=new PizzaFactory();

    }

    public void createPizza(String type){
        factory.createPizza(type);
    }

    public Pizza getPizza(){

        Pizza pizza = factory.getPizza();
        return pizza;
    }



}
