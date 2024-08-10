package ElevatorDesign.ElevatorController;

import java.lang.classfile.ClassFile.Option;
import java.util.Optional;

import ElevatorDesign.Elevator.Elevator;
import ElevatorDesign.ElevatorController.Request.ElevatorCallRequest;
import ElevatorDesign.ElevatorController.Request.Request;
import ElevatorDesign.ElevatorController.Strategy.ElevatorStrategy;


// our controller has a reference of the strategy that we need to add.
public interface Controller {

    public Optional<Elevator> getOptimalElevator(ElevatorCallRequest req);

    public void RegisterElevator(Elevator elevator);

    public void setStrategy(ElevatorStrategy strategy);
    // create the tasks for the elevator so that they can perform the request.
    public Request createTask(int source, int destination);

    public void getElevator(ElevatorCallRequest req);


    
}
