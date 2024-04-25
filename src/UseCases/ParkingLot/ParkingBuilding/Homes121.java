package UseCases.ParkingLot.ParkingBuilding;

import UseCases.ParkingLot.ParkingSpot.CarParkingSpot;
import UseCases.ParkingLot.ParkingSpot.TruckParkingSpot;

public class Homes121 extends  ParkingLotBuilding {
  private  int width;
  private  int height;
  private  int length;

 private   CarParkingSpot carSpots;

  private  TruckParkingSpot truckSpots;



    public Homes121(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getCarSpots() {
        return carSpots.getRemainingItems();
    }

    public void setCarSpots(CarParkingSpot carSpots) {
        this.carSpots = carSpots;
    }

    public int getTruckSpots() {
        return truckSpots.getRemainingItems();
    }

    public void setTruckSpots(TruckParkingSpot truckSpots) {
        this.truckSpots = truckSpots;
    }

    // composition of each and every items ?

    //


    @Override
    protected int getWidth() {
        return width;
    }

    @Override
    protected int getHeight() {
        return height;
    }

    @Override
    protected int getLength() {
        return length;
    }
}
