package Behavioural.State.VendingMachine.Storage;

import java.util.concurrent.ConcurrentHashMap;

// SingleTon of having storage !!
public class VendingStorage implements InventoryManager {

   private ConcurrentHashMap<Integer,Product> map;

    public VendingStorage(){

        if(map==null)map=new ConcurrentHashMap<Integer,Product>();


    }

    @Override
    public void addProduct(Product newProduct) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteProduct(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isAvailable(Product product) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void updateQuantity(Product product) {
        // TODO Auto-generated method stub
        
    }


    
    
}
