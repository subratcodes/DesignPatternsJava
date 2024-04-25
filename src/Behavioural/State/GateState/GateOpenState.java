package Behavioural.State.GateState;

import Behavioural.State.Gate.GateStateManager;

public class GateOpenState implements GateState {

    GateStateManager gateStateManager;

    public GateOpenState(GateStateManager gateStateManager) {
        this.gateStateManager = gateStateManager;
    }

    @Override
    public void gateOpen() {

        System.out.println("Processing");
        gateStateManager.setGateState(new GateCloseState());

    }

    @Override
    public void gateClose() {

        gateStateManager.setGateState(new GateCloseState());
    }

    @Override
    public void processing() {



    }

}
