import java.util.concurrent.CountDownLatch;
import CountDownLatch.Worker;
import Problems.Data;

public class Main {
    public static void main(String[] args) {


        Data d=new Data(0);

        Thread t1=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<10000000;i++){
                    int val=d.getCount();
                    d.setCount(val+1);
                }
            }
        });




        Thread t2=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<10000000;i++){
                    int val=d.getCount();
                    d.setCount(val+1);
                }
            }
        });

            t1.start();
            t2.start();



        System.out.println(d.getCount());




    }



}


