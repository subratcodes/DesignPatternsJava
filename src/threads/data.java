package threads;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;


public class data implements Callable {
  CountDownLatch latch;


  public data(CountDownLatch latch){
    this.latch=latch;

  }

    @Override
    public LinkedList<Integer> call() throws Exception {
        // TODO Auto-generated method stub
        LinkedList<Integer> list=new LinkedList<Integer>();
      

        try {
         File myObj = new File("/Users/subrat/Downloads/lowlevelDesign/src/threads/numbers.txt");
         Scanner myReader = new Scanner(myObj);
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           list.add(Integer.valueOf(data));
         }
         myReader.close();
       } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
       }

       latch.countDown();
       return list;
    }


    


    
    
}
