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
        o.confirmSubscription();
        NotifySpecificObserver(o);
    }

    @Override
    public void removeObserver(Observer o) {
         int index=observers.indexOf(o);
         observers.remove(index);
    }


    public void NotifySpecificObserver(Observer o){
        for(int i=0;i<observers.size();i++){
            if(observers.get(i).equals(o)){
                o.update(weatherData.getHumidty(),weatherData.getPressure(), weatherData.getPressure());
                break;
            }
        }

    }

    public void setMeasurements(Data newChanges){
         weatherData=newChanges;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        float temprature= weatherData.getTemprature();
        float humidty= weatherData.getHumidty();
        float pressure= weatherData.getPressure();
      for(int i=0;i<observers.size();i++){

          observers.get(i).update(temprature,humidty,pressure);
      }
    }
}
