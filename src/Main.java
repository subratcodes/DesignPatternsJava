import java.util.concurrent.CountDownLatch;
import CountDownLatch.Worker;
import Problems.Data;

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
        });

          

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



    }



}


