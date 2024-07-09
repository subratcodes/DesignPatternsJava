package DesignPatterns.Factory;

public class PizzaFactory {
  
    
    public static Pizza createPizza(String type) throws InterruptedException{

        Pizza pizza=null;

        if(type=="pepporoni") pizza=new Pepporoni();
         else if(type=="margeritha")pizza=new Maghertia();
         else System.out.println("Not correct defined type");


         pizza.createPizza();
         pizza.packPizza();
         return pizza;

    }



}


// is the pizza facotry being a shared state or not  ? What is the natuee od the state of the Pizza Facotry ?
