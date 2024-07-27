package Problems;

public class Data {

   public volatile int counter;
    
    Object obj=new Object();


    public Data(int count){
        this.counter=count;
    }


    // public synchronized void increment(){
    //    counter++;
    // }

    public  void increment(){
        synchronized(this.obj){
            counter++;
          //  System.out.println(this.counter);
        }
       
    }

    public void setCount(int val){
        synchronized(this.obj){
            this.counter=val;
           
        }
    }

    public  void decrement(){
        synchronized(this.obj){
            counter--;
           
        }
    }

    // this method is not synchnoized yet. Let see if it produces unreal output.
    public int getCount(){
       synchronized(this.obj){
        return this.counter;
       }
    }

    
}
