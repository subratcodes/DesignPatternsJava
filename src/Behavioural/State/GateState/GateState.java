package Behavioural.State.GateState;

public interface GateState {

    public void gateOpen();

    public void gateClose();

    public void processing();

    public  default void someMethod(){
        System.out.println("This is a method");
    }

}
