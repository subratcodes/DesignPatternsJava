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
import threads.Task;



public class Main {
    public static void main(String[] args) throws InterruptedException {

            //shared data
        Data d=new Data(0);

        Thread t1=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<100;i++){
                    int val=d.getCount();
                    d.setCount(val+1);
                    d.increment();
                    
                }
            }
        };

<<<<<<< HEAD
          

        Thread t2=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<100;i++){
                    int val=d.getCount();
                    d.setCount(val+1);
                }
            }
        });

        Thread[] tasks=new Thread[]{t1,t2};

        for(Thread task:tasks){
            task.start();
            task.join(1000);
        }


        System.out.println(d.getCount());
=======
        Runnable runnable2 =()->{
            try {

                PizzaFactory.createPizza("margeritha");
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Some Exception occured while creating your pizza");
            }
        };
>>>>>>> 8f6d19e288fbae4fecd0f9f52f72a174bbc953be

       
        Runnable runnable3 =()->{
            try {

                PizzaFactory.createPizza("margeritha");
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Some Exception occured while creating your pizza");
            }
        };

        t.addTask(runnable);
        t.addTask(runnable2);
        t.addTask(runnable3);


<<<<<<< HEAD
=======
        

>>>>>>> 8f6d19e288fbae4fecd0f9f52f72a174bbc953be
    }




}


