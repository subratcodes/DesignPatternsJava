package Behavioural.ObserverV2.Displays;

import Behavioural.Observer.Display;
import Behavioural.Observer.Entity.Data;
import Behavioural.ObserverV2.WeatherPublisher;

import java.util.Observable;
import java.util.Observer;

public class Watch implements Observer, Display {
    private Data watchData;
    @Override
    public void Display() {
        System.out.println(watchData.getTemprature()+"temp");
        System.out.println(watchData.getHumidty()+"humidity");
        System.out.println(watchData.getPressure()+"pressure");
    }

    private void setWatchData(Data newData){
        this.watchData=newData;
        Display();
    }

    @Override
    public void update(Observable o, Object arg) {

         if(o instanceof WeatherPublisher){
             WeatherPublisher data=(WeatherPublisher) o;
             setWatchData(data.getWeatherData());
         }
    }
}
