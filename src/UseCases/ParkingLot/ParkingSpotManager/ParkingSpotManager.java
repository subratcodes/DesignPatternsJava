package UseCases.ParkingLot.ParkingSpotManager;

import UseCases.ParkingLot.ParkingSpot.CarParkingSpot;
import UseCases.ParkingLot.ParkingSpot.ParkingSpot;
import UseCases.ParkingLot.ParkingSpotStrategy.ParkingSpotStrategy;

import java.util.ArrayList;
import java.util.List;

/*

    1. Either we use dependency injection to create different implementations of the manager.
    2.  We hardcore it, in terms of finding Parking sport.

*/

public class ParkingSpotManager {
  private List<ParkingSpot> spots;

    public ParkingSpotManager(List<ParkingSpot>spot){
       this.spots=spot;


    }

    public String findparkingSpot(ParkingSpotStrategy strategy){


        return new String("Parking Spot found");

    }










}
