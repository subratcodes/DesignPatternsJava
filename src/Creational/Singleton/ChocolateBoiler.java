package Creational.Singleton;

public class ChocolateBoiler {
    private Boolean empty;
    private Boolean boiled;

    private static ChocolateBoiler instance;

    private ChocolateBoiler(){
        this.empty=false;
        this.boiled=false;
    }
    public ChocolateBoiler getInstance(){
        if(instance==null) instance=new ChocolateBoiler();
        return instance;
    }


    public Boolean getEmpty() {
        return empty;
    }

    public Boolean getBoiled() {
        return boiled;
    }
}
