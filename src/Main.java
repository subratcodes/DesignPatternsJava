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


    public static void main(String[] args) {
 

        Customer subrat=new Customer("Subrat","pepporoni");
        TaskManager t=new TaskManager();


        // Thread s=new Thread(()->{
        //     try {
        //         Pizza peporoni=PizzaFactory.createPizza("pepporoni");
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        // });


        // Thread sanjay=new Thread(()->{
        //     try {
        //         Pizza peporoni=PizzaFactory.createPizza("margeritha");
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        // });

        Runnable runnable =()->{
            try {

                PizzaFactory.createPizza("pepporoni");
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Some Exception occured while creating your pizza");
            }
        };

        Runnable runnable2 =()->{
            try {

                PizzaFactory.createPizza("margeritha");
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Some Exception occured while creating your pizza");
            }
        };

       
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


        

    }




}


