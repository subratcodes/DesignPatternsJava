package Behavioural.Observer;

import Behavioural.Observer.Entity.Data;

import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.List;

public class WeatherPublisher implements Subject {

   private List<Observer> observers;


    private Data weatherData;


    public WeatherPublisher(Data weatherData){
          observers=new ArrayList<>();
          this.weatherData=weatherData;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
        notifyObservers();
    }

    @Override
    public void removeObserver(Observer o) {
         int index=observers.indexOf(o);
         observers.remove(index);
    }


    public void setMeasurements(Data newChanges){
         weatherData=newChanges;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
      for(int i=0;i<observers.size();i++){
       float temprature= weatherData.getTemprature();
       float humidty= weatherData.getHumidty();
       float pressure= weatherData.getPressure();

          observers.get(i).update(temprature,humidty,pressure);
      }
    }
}
