package Behavioural.Observer;

import Behavioural.Observer.Displays.MobileDisplay;
import Behavioural.Observer.Displays.Watch;
import Behavioural.Observer.Entity.Data;

import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){

        Data LosAngeles= new Data(12,312,12);
        WeatherPublisher api=new WeatherPublisher(LosAngeles);


//        Logger logger = Logger.getLogger(Main.class.getName());
//
//

        Watch appleWatch=new Watch();
        Watch appleWatchSE=new Watch();
        api.addObserver(appleWatch);
        api.addObserver(appleWatchSE);

    }
}
