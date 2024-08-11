import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskManager {

 private final ExecutorService service = Executors.newFixedThreadPool(3);

 public void addTask(Runnable task){
    service.submit(task);
 }

 public void shutdown(){
  service.shutdown();
 
}

    
}
