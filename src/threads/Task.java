package threads;

public class Task implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try{
            String name=Thread.currentThread().getName();
            System.out.println("Parent Thread running");
    
            Thread.sleep(2000);

            boolean b=true;

            if(Thread.currentThread().isDaemon())throw new Exception("Deamon Threads cannot have child process");
    
            // each thread can have its own chiqld process threads .
            Thread childThread=new Thread(()->{
                System.out.println("Child thread of"+name);
            });
    
            childThread.start();


        }catch(Exception e){

            System.out.println("Thread interupted via"+e.getMessage());

        }

    
    
    }
    
    
}
