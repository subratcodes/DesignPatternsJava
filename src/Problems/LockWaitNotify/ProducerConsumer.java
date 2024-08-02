package Problems.LockWaitNotify;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
    private final LinkedList<Integer> buffer;
    private final int capacity;
    private final Lock lock;
    private final Condition notFull;
    private final Condition notEmpty;
    private  int iterator=0;

    public ProducerConsumer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
        this.lock = new ReentrantLock();
        this.notFull = lock.newCondition();
        this.notEmpty = lock.newCondition();
    }

    class Producer implements Runnable {
        public void run() {
            while (iterator<100) {
                int value = produce(); // Replace with actual production logic
                lock.lock();
                try {
                    while (buffer.size() == capacity) {
                        notFull.await();
                    }
                    buffer.add(value);
                    System.out.println("Producer produced: " + value);
                    iterator++;
                    notEmpty.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }

        private int produce() {
            // Replace with actual production logic
            return (int)(Math.random() * 10);
        }
    }

    class Consumer implements Runnable {
        public void run() {
            while (true) {
                lock.lock();
                try {
                    while (buffer.isEmpty()) {
                        notEmpty.await();
                    }
                    int value = buffer.removeFirst();
                    System.out.println("Consumer consumed: " + value);
                    notFull.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer(2);
        Thread producer = new Thread(pc.new Producer());
        Thread consumer = new Thread(pc.new Consumer());
        producer.start();
        consumer.start();
    }
}
