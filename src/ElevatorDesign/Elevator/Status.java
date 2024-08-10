package ElevatorDesign.Elevator;

public class Status {
    // by default are going to have aidle state.
    private Direction currentDirection=Direction.IDLE;
    private int currentFloor;
    private boolean isMoving;
    private boolean isError;
    private Enum ERRORCODE;
    

    public Status(Direction currentDirection, int currentFloor, boolean isMoving) {
        this.currentDirection = currentDirection;
        this.currentFloor = currentFloor;
        this.isMoving = isMoving;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    public boolean isMoving() {
        return isMoving;
    }
    public void setMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }
    


}
