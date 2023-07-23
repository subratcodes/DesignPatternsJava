package Structural.Decorator;

import Structural.Decorator.Beverage.Beverage;
import Structural.Decorator.Beverage.Expresso;
import Structural.Decorator.Beverage.HouseBlen;
import Structural.Decorator.Condiments.Mocha;
import Structural.Decorator.Condiments.SoyMilk;


public class main {
    public static void main(String[] args){

        Beverage expresso=new Expresso();
        System.out.println(expresso.getDescription());
        expresso=new Mocha(expresso);
        expresso=new SoyMilk(expresso);
        System.out.println(expresso.getDescription()+ " "+expresso.cost());




    }

}
