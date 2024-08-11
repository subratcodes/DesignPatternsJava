package ElevatorDesign.ElevatorController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import ElevatorDesign.Elevator.Direction;
import ElevatorDesign.Elevator.Elevator;
import ElevatorDesign.ElevatorController.Request.ElevatorCallRequest;
import ElevatorDesign.ElevatorController.Request.Request;
import ElevatorDesign.ElevatorController.Strategy.ElevatorStrategy;

public class BasicElevatorController implements Controller {
    
  private static BasicElevatorController elevatorController;

  private ElevatorStrategy strategy;

  private List<Elevator> elevators=new ArrayList<Elevator>();

    // single ton class Approach.
    private BasicElevatorController(){


    }

    // static get methods to get the elevator class.
    public static Controller getElevatorControllerInstance(){

        if(BasicElevatorController.elevatorController==null) elevatorController=new BasicElevatorController();
        
        return elevatorController;
    }


    @Override
    public Optional<Elevator> getOptimalElevator(ElevatorCallRequest req) {
        return strategy.getElevator(req.getSourceFloor(),this.elevators);
    }


    private void simulateElevatorMovement(Elevator instance, int destinationFloor){

        int currentfloor=instance.getCurrentFloor();

        try {

            while(currentfloor!=destinationFloor){
                
                if (currentfloor>destinationFloor)currentfloor--;
                else currentfloor++;
                Thread.sleep(2000);
                System.out.println("Reached floor at"+currentfloor);
            }

            System.out.println("Reached Opening Doors");
            Thread.sleep(2000);
            System.out.println("Doors oopened");
    
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Interception occured while navigating lift.");
        }

    }


    public synchronized void  getElevator(ElevatorCallRequest req){

        Optional<Elevator> elevatorId=this.getOptimalElevator(req);  
        
        Elevator instance=elevatorId.get();
        
        this.simulateElevatorMovement(instance,req.getSourceFloor());

    

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Destination floor"); 
        String destinationFloor = myObj.nextLine();  // Read user input
        // Create a Scanner object
        Request newReq=new Request(req.getSourceFloor(), Integer.valueOf(destinationFloor));

        if(elevatorId.isPresent()){
            instance.addRequest(newReq);
            instance.run();
        }

    }


    public ElevatorStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ElevatorStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void RegisterElevator(Elevator elevator){
        elevators.add(elevator);
    }


    @Override
    public Request createTask(int source, int destination){
        return new Request(source, destination);
    }

    
    
}
