package CountDownLatch;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    

    public static void main(String[] args){
        ExecutorService service=Executors.newFixedThreadPool(1); 
        CountDownLatch latch=new CountDownLatch(5);


        try {
            
            List<Thread> workers=Stream.generate(()->new Worker(1000, latch, "Subrat")).limit(5).collect(Collectors.toList());
    
            workers.forEach((Thread a)->{
                service.submit(a);
            });
            
            if (!service.awaitTermination(1000, TimeUnit.MILLISECONDS))service.shutdown();
            
            latch.await();
            System.out.println("Runs this part");
            
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            service.shutdownNow();
        }

      



    }
}
