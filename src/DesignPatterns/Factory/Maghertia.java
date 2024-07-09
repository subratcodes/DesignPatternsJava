package DesignPatterns.Factory;

public class Maghertia implements Pizza {

    @Override
    public void createPizza() throws InterruptedException {


        try {
            System.out.println("Magertia being created");
            Thread.sleep(2000);
                System.out.println("Magertia has been created");
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        // TODO Auto-generated method stub
    
        
    }

    @Override
    public void packPizza() throws InterruptedException {
        // TODO Auto-generated method stub

        try{

            Thread.sleep(1000);
            System.out.println("Magertia being packed");

        }catch(Exception e){

            System.out.println("Exception in"+Thread.currentThread().getName());
        }
      

        
    }
    
    
}
