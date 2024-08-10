package ElevatorDesign.Elevator;

public class ElevatorInfo {
    private int capacity;
    private int width;
    private int height;
    private int maxFloor=10;
    private int minFloor=0;
    

    public ElevatorInfo(int capacity, int width, int height) {
        this.capacity = capacity;
        this.width = width;
        this.height = height;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getMaxFloor() {
        return maxFloor;
    }
    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }
    public int getMinFloor() {
        return minFloor;
    }
    public void setMinFloor(int minFloor) {
        this.minFloor = minFloor;
    }


    
    
}
