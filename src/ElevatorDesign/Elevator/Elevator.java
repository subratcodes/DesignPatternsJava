package ElevatorDesign.Elevator;

import java.util.LinkedList;
import java.util.Queue;

import ElevatorDesign.ElevatorController.Request.Request;

public class Elevator {

    private ElevatorInfo info;
    private Status status;
    private Queue<Request> workOrder; 
    private int totalWeight;

    public Elevator(int capacity, int width, int height){
        info=new ElevatorInfo(capacity, width, height);
        status=new Status(Direction.IDLE, 0, false);
        workOrder=new LinkedList<Request>();

    }
    public boolean addRequest(Request data){
       return workOrder.offer(data);
    }

    public Request getNextRequest(){
        return workOrder.poll();
    }


    public void processRequest(){

        System.out.println("Processing the request for the elevator.");

        Request data=this.getNextRequest();
        //set the source flooor.
        status.setCurrentFloor(data.getSourceFloor());
        
        //get the current direction we need to move.
        // maybe we canturn this into a static function.
        Direction d=status.getCurrentFloor()>data.getDestinationFloor()? Direction.DOWN: Direction.UP;
        
        if(d==Direction.DOWN){

           try {
            
            while(status.getCurrentFloor()!=data.getDestinationFloor()){
                System.out.println(status.getCurrentFloor());
                status.setCurrentFloor(status.getCurrentFloor()-1);
                Thread.sleep(2000);
            }
            
            System.out.println("Reached the destination floor");
            
           } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception in running lieft May day !!! ");
           }
    
            
        }else if(d==Direction.UP){
            while(status.getCurrentFloor()!=data.getDestinationFloor()){
                status.setCurrentFloor(status.getCurrentFloor()+1);
            }
        }else System.out.println("Process is idle");
        // when elevator is tryign to process the request , it will check the values.
    }


    public void run() {
        processRequest();
    }

    public int getCurrentFloor() {
        return status.getCurrentFloor();
    }






}
