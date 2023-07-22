package Behavioural.Observer.Displays;

import Behavioural.Observer.Display;
import Behavioural.Observer.Observer;
import Behavioural.Observer.Subject;

public class MobileDisplay implements Display, Observer {

    private float temperature;
    private float humidity;

    private  float pressue;
    private Subject weatherData;


    public MobileDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void confirmSubscription() {
        System.out.println("Mobile Subscription added");
    }

    @Override
    public void Display() {
        System.out.println(temperature+" "+" humid "+ humidity+" "+"Pressure "+pressue);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
         this.temperature=temp;
         this.humidity=humidity;
         this.pressue=pressure;
         Display();
    }
}
