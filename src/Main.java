

import Problems.LockWaitNotify.Producer;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Producer p=new Producer(10,20);

            //shared data
          

            Thread t1=new Thread(new Runnable(){
                public void run(){
                    try {

                      p.producer("Message ID :", 10);
                        
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Exceptiuon occured for"+"Thread");
                    }
                    
                }
            });
    
    
            Thread t2=new Thread(new Runnable(){
                public void run(){
                    try {
                        p.consumer();
                        
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Error at consumer sectioon");
                    }
                  
                }
            });

            Thread[] tasks=new Thread[]{t1,t2};


            //consider these 2 threads. We want all of the threads to ru
                    for(Thread task:tasks){
                        task.start();
                        task.join();
                    }
            
            
            
            // if we would not have joined it. This SOUt would have runn .
            // but since we have joinred. This wont run. until t1 and t2 completes.
            
                   
    
    }




}


