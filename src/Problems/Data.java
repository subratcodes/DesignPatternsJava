package Problems;

public class Data {

   volatile int counter=0;
    
    public Data(int count){
        this.counter=count;
    }


    // public synchronized void increment(){
    //    counter++;
    // }

    public void setCOunt(int val){
        this.counter=val; 
    }

    public int getCount(){
        return this.counter;
    }

    
}
