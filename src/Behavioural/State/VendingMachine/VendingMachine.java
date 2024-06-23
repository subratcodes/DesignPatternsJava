package Behavioural.State.VendingMachine;

import Behavioural.State.VendingMachine.States.CoinsState;
import Behavioural.State.VendingMachine.States.DisburseState;
import Behavioural.State.VendingMachine.States.SelectionState;
import Behavioural.State.VendingMachine.States.State;
import Behavioural.State.VendingMachine.Storage.InventoryManager;
import Behavioural.State.VendingMachine.Storage.Product;
import Behavioural.State.VendingMachine.Storage.VendingStorage;

// we will try to use of composiiton over here.
public class VendingMachine {

   private  State currentState;
   private   InventoryManager manager;
   private  State selectionState;
   private  State coinsState;
   private  State disburseState;

   private  Product currentSelectedProduct;

   private double coinsAdded;


    public VendingMachine(){
        manager=new VendingStorage();
        selectionState=new SelectionState(this);
        coinsState=new CoinsState(this);
        disburseState=new DisburseState(this);

        currentState=selectionState;
        manager=new VendingStorage();
        
    }

    protected InventoryManager getInventoryManager(){
        return manager;
    }


    public boolean addCoins(double amount){
        try {

        coinsAdded+=amount;
        return true;
            
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    
    }



    public void selectProduct(){
        currentState.selectProduct();

    }

    public void setState(State newState){
        currentState=newState;
    }
    






    
}




