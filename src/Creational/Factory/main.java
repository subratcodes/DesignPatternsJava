package Creational.Factory;

public class main {
    public static void main(String[] args){
        PizzaStore newYork=new PizzaStore();

        newYork.createPizza("pepporoni");
         Pizza mypizza= newYork.getPizza();




    }
}
