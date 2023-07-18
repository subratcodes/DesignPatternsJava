package Behavioural.Observer;

import Behavioural.Observer.Displays.MobileDisplay;
import Behavioural.Observer.Displays.Watch;

public class Main {
    public static void main(String[] args){
        WeatherPublisher api=new WeatherPublisher();

//        MobileDisplay iPhone=new MobileDisplay(api);
//        api.setMeasurements(12,13,14);


        Watch appleWatch=new Watch();
        api.addObserver(appleWatch);
        api.setMeasurements(14,12,13);

    }
}
