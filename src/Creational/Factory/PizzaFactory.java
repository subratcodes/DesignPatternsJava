package Creational.Factory;

public class PizzaFactory {
    Pizza pizza=null;

    public void createPizza(String type){

    if(type=="pepporoni") pizza=new Pepporoni();
    else if(type=="margeritha")pizza=new Margeritha();
    else System.out.println("Not correct defined type");

    pizza.createPizza();
    pizza.packPizza();

    //problem with this approach
}


public void PackPizza(){
        pizza.packPizza();
}

public Pizza getPizza(){
        return pizza;
}





}
