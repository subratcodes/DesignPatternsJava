package Behavioural.Observer.Displays;

import Behavioural.Observer.Display;
import Behavioural.Observer.Observer;

import java.time.LocalTime;


public class Watch implements Display, Observer {

    LocalTime currentTime;
    float temperature;
    float humidiy;
    float pressure;

    public Watch(){
        currentTime=LocalTime.now();
    }

    @Override
    public void Display() {
        System.out.println(currentTime.toString());
        System.out.println(temperature+"temp");
        System.out.println(humidiy+"humidity");
        System.out.println(pressure+"pressure");
    }

    public void confirmSubscription(){
        System.out.println(" Apple Watch Registered");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temperature=temp;
        this.humidiy=humidity;
        this.pressure=pressure;
        Display();

    }
}
