package Behavioural.Observer.Entity;

public class Data {

    private float temprature;
    private float humidty;
    private float pressure;


    public Data(float temprature,float humidty,float pressure){

        this.temprature=temprature;
        this.humidty=humidty;
        this.pressure=pressure;

    }


    public float getTemprature() {
        return temprature;
    }

    public void setTemprature(float temprature) {
        this.temprature = temprature;
    }

    public float getHumidty() {
        return humidty;
    }

    public void setHumidty(float humidty) {
        this.humidty = humidty;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
