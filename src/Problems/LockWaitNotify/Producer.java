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
    private boolean bufferFull=false;
    
    public Producer(int capacity, int iterations){

        this.queue=new ArrayDeque<String>(capacity);
        
        this.capacity=capacity;
        
        this.index=iterations;
    }

    private int produce() {
        // Replace with actual production logic
        return (int)(Math.random() * 10);
    }


    public void producer(String message,int index) throws InterruptedException{

        synchronized(lock){

            while(currentPointer<index){

                while(queue.size()==capacity){
                    try {
                        lock.wait();
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("SOme error in adding value");
                    }
    
                }
                System.out.println("Producer adding::::"+currentPointer);
                queue.add(String.valueOf(currentPointer++));

                if (queue.size()==capacity){
                    bufferFull=true;
                    lock.notify();
                    
                }

                Thread.sleep(1000);
            }

            }
          
        }

    

    public void consumer() throws InterruptedException{

        synchronized(lock){

            while(currentPointer<index){
                while(!bufferFull){
                    try {
                        lock.wait();
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Error at"+e.getMessage());
                    }
                }
             
           
                while(queue.size()>0){
                    System.out.println(queue.poll());
                }
                bufferFull=false;

            }
       
        }

    }


    
}
