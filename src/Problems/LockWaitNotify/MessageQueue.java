package Problems.LockWaitNotify;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {
    private Queue<String> queue;
    private int capacity;

    public MessageQueue(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public boolean isQueueEmpty(){
        return queue.isEmpty();
    }

    public synchronized void put(String message) throws InterruptedException {
        if(queue.size() == capacity) {
            System.out.println("Queue reached min capacity in waiting state");
            wait();
        }else{
            System.out.println("Pushing the message in"+message);
            queue.offer(message);
            notify();
        }
        //notify();
    }

    public synchronized void take() throws InterruptedException {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty calling to fill more");
            wait();
        }else{
            String message = queue.poll();
            System.out.println("Pooling the message out"+message);
            notify();
        }
  
    }
}