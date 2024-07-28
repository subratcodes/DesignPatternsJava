package Problems.LockWaitNotify;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;

public class Producer {

    private Queue<String> queue;
    private Object lock=new Object();
    private int capacity=0;
    private volatile int currentPointer=0;
    private int index; 
    
    public Producer(int capacity, int iterations){

        this.queue=new ArrayDeque<String>(capacity);
        
        this.capacity=capacity;
        
        this.index=iterations;
    }

    public void producer(String message,int index) throws InterruptedException{

        synchronized(lock){
            
            
            while(currentPointer<index){

                if(queue.size()==capacity)lock.wait();
                
                System.out.println("Going to add"+message+":"+currentPointer);
                queue.offer(message+currentPointer);

                currentPointer++;

               

            }


          
        }

    }

    public void consumer() throws InterruptedException{

        synchronized(lock){

            while(queue.size()){

                System.out.println(queue.poll());

            }

            lock.notify();
        }

    }


    
}
