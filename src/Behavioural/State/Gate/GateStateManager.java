package Behavioural.State.Gate;

import Behavioural.State.GateState.GateCloseState;
import Behavioural.State.GateState.GateState;

public class GateStateManager {

    GateState gateState;

    public GateStateManager(){
       this.gateState=new GateCloseState();
    }

    public GateState getGateState() {
        return this.gateState;
    }

    public void setGateState(GateState gateState) {
        this.gateState = gateState;
    }


}
