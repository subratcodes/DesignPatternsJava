package UseCases.ParkingLot.ParkingSpot;

public abstract class ParkingSpot {

    // certain list of methods that the class needs to have .

    public abstract int  getRemainingItems();

    public int getArea(int dimensions){
        return dimensions*dimensions;
    }
    public abstract int getDimensions();


    public abstract String getLocation();


}
