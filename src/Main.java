import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import CountDownLatch.Worker;
import Problems.Data;
import threads.Task;








public class Main {


    public static void main(String[] args) {
      

   Thread a=new Thread(new Task());
    
   a.start();




    }



}


