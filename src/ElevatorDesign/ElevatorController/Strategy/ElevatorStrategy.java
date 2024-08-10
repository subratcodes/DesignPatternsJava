package ElevatorDesign.ElevatorController.Strategy;

import java.util.List;
import java.util.Optional;

import ElevatorDesign.Elevator.Elevator;

public interface ElevatorStrategy {

    public Optional<Elevator> getElevator(int currentFloor,List<Elevator> list);
    
    
}
