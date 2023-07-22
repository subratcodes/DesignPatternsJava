package Behavioural.ObserverV2;

import Behavioural.Observer.Entity.Data;

import java.util.Observable;

public class WeatherPublisher extends Observable {

    //do not need any storage for observers.
    private Data weatherData;

    public WeatherPublisher(){

    }

    public void changeDetected(){
        setChanged();
        notifyObservers();
    }


    //takes the new chnage and calls the chnage detected.
    public void setMeasurements(Data newChanges){
       this.weatherData=newChanges;
        changeDetected();
    }

    public Data getWeatherData() {
        return weatherData;
    }

}
