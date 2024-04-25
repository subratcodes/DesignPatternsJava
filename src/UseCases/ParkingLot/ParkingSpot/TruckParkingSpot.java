package UseCases.ParkingLot.ParkingSpot;

public class TruckParkingSpot extends ParkingSpot {

    private String location;

    private int totalItems;


    private int dimensions;


    public TruckParkingSpot(){

    }



    @Override
    public int getRemainingItems() {
        return 0;
    }

    @Override
    public int getDimensions() {
        return 0;
    }

    @Override
    public String getLocation() {
        return null;
    }
}
