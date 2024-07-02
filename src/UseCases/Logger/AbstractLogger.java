package UseCases.Logger;

// logger chain.
public abstract class AbstractLogger {

     int level;
     AbstractLogger loggerChain;

     public void setNextLogginLevel(AbstractLogger logger){
        this.loggerChain=logger;

     }

     public void logMessage(int level, String msg){
        if(this.level<=level)display(msg);
        else loggerChain.logMessage(level, msg);
     }

     protected abstract void display(String msg);
    
}
