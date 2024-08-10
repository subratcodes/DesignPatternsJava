import java.lang.ModuleLayer.Controller;

import ElevatorDesign.Elevator.Elevator;
import ElevatorDesign.ElevatorController.BasicElevatorController;
import ElevatorDesign.ElevatorController.Request.ElevatorCallRequest;
import ElevatorDesign.ElevatorController.Strategy.ElevatorStrategy;
import ElevatorDesign.ElevatorController.Strategy.FindNearestStrategy;

public class Main{


    public static void main(){
        ElevatorDesign.ElevatorController.Controller c_Controller=BasicElevatorController.getElevatorControllerInstance();
        ElevatorStrategy str=new FindNearestStrategy();
        Elevator one= new Elevator(10,100,400);

        c_Controller.RegisterElevator(one);
        c_Controller.setStrategy(str);

        ElevatorCallRequest req=new ElevatorCallRequest(10);

        c_Controller.getElevator(req);


    }


}