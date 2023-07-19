package Behavioural.Observer;

import Behavioural.Observer.Displays.MobileDisplay;
import Behavioural.Observer.Displays.Watch;
import Behavioural.Observer.Entity.Data;

public class Main {
    public static void main(String[] args){

        Data LosAngeles= new Data(12,312,12);
        WeatherPublisher api=new WeatherPublisher(LosAngeles);


        Watch appleWatch=new Watch();
        api.addObserver(appleWatch);

    }
}
