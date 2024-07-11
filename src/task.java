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








public class task {


    public static void main(String[] args) {
 

        Customer subrat=new Customer("Subrat","pepporoni");
        TaskManager t=new TaskManager();


        Thread s=new Thread(()->{
            try {
                Pizza peporoni=PizzaFactory.createPizza("pepporoni");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });



        Thread sanjay=new Thread(()->{
            try {
                Pizza peporoni=PizzaFactory.createPizza("margeritha");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

      

    }



}


