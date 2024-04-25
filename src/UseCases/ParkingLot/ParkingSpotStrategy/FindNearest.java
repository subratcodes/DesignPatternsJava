package UseCases.ParkingLot.ParkingSpotStrategy;

import java.util.ArrayList;
import java.util.List;

public class FindNearest implements ParkingSpotStrategy {

 private  List<Integer> parkingLost;


    public void getparkingLotInstance(){

        parkingLost=new ArrayList<Integer>();

    }

    @Override
    public void findParkingSpot() {

    }
}
