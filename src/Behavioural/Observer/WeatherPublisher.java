package Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherPublisher implements Subject {

   private List<Observer> observers;
   private float temprature;
   private float humidty;
   private float pressure;


    public WeatherPublisher(){
          observers=new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
         int index=observers.indexOf(o);
         observers.remove(index);
    }


    public void setMeasurements(float temprature, float humidty,float pressure){
        this.temprature=temprature;
        this.humidty=humidty;
        this.pressure=pressure;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
      for(int i=0;i<observers.size();i++){
          observers.get(i).update(temprature,humidty,pressure);
      }
    }
}
