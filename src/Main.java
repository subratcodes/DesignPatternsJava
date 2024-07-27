import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import CountDownLatch.Worker;
import DesignPatterns.CustomerInfo.Customer;
import DesignPatterns.Factory.Pizza;
import DesignPatterns.Factory.PizzaFactory;
import Problems.Data;
import threads.Task;



public class Main {
    public static void main(String[] args) throws InterruptedException {

        Data d=new Data(0);

            //shared data
          

            Thread t1=new Thread(new Runnable(){
                public void run(){
                    for(int i=0;i<100000;i++){
                        int val=d.getCount();
                        d.setCount(val+1);
                        
                    }
                }
            });
    
              
    
            Thread t2=new Thread(new Runnable(){
                public void run(){
                    for(int i=0;i<100000;i++){
                        int val=d.getCount();
                        d.setCount(val-1);
                    }
                }
            });

            Thread[] tasks=new Thread[]{t1,t2};


            //consider these 2 threads. We want all of the threads to ru
                    for(Thread task:tasks){
                        task.start();
                        task.join();
                    }
            
            
            
            // if we would not have joined it. This SOUt would have runn .
            // but since we have joinred. This wont run. until t1 and t2 completes.
            
                    System.out.println(d.getCount());
    
    }




}


