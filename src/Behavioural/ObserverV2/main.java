package Behavioural.ObserverV2;

import Behavioural.Observer.Entity.Data;
import Behavioural.ObserverV2.Displays.Watch;

public class main {
    public static void main(String[] args){
          WeatherPublisher soap=new WeatherPublisher();
         Watch apple=new Watch();
          soap.setMeasurements(new Data(12,34,44));

    }
}
