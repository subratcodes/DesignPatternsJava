package DesignPatterns.CustomerInfo;

import java.util.UUID;

public class Customer {

    String name;
    UUID orderID;
    String pizzaID;

    public Customer(String name,String id){
        this.name=name;
        this.orderID=UUID.randomUUID();
        this.pizzaID=id;
    }


    public UUID getOrder(){
        return this.orderID;
    }
    
}
