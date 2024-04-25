package UseCases.ParkingLot.ParkingSpot;

public class CarParkingSpot extends ParkingSpot {

    private String location;

    private int totalItems;

    private int dimensions;


    public CarParkingSpot(String location, int totalItems, int dimensions) {
        this.location = location;
        this.totalItems = totalItems;
        this.dimensions = dimensions;
    }

    public  int getArea(){
        int area = super.getArea(getDimensions());
        return area;
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
