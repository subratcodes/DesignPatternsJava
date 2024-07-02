package UseCases.Logger;

public class ConsoleLogger extends AbstractLogger {


    
    public ConsoleLogger(int level){
         this.level=level;
         System.out.println(this);

    }
    
    @Override
    public void display(String msg) {
        // TODO Auto-generated method stub
        
        
    }

    
    
}
