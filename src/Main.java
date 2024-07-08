import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;
import java.util.concurrent.CountDownLatch;
import CountDownLatch.Worker;
import Problems.Data;
import javafx.scene.shape.Path;

public class Main {




    public static void main(String[] args) {

        File file = new File("/workspace/DesignPatternsJava/src/Problems/file.txt");

        System.out.println("Is exist: " + file.exists()); // Is exist: true
        System.out.println("Is file: " + file.isFile()); // Is file: true
        System.out.println("Name of file: " + file.getName());


        



    }



}


