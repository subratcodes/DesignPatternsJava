package ElevatorDesign.ElevatorController.Strategy;
import java.util.List;
import java.util.Optional;
import ElevatorDesign.Elevator.Elevator;

public class FindNearestStrategy implements ElevatorStrategy {

    @Override
    public Optional<Elevator> getElevator(int currentFloor,List<Elevator> elevators) {
        // TODO Auto-generated method stub
        //gt
        int minDistance=Integer.MAX_VALUE;
        Elevator id=null;

        for(Elevator ele:elevators){

            int elevatorPosition=ele.getCurrentFloor();
            int distanceWithFloors=Math.abs(elevatorPosition-currentFloor);

            if(distanceWithFloors<minDistance){
                minDistance=distanceWithFloors;
                id=ele;
            }

        }

        return Optional.of(id);
        
    }


    
}
