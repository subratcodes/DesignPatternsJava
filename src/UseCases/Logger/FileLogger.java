package UseCases.Logger;


//singleton implementation of the logger over here.
public class FileLogger implements Logger {

   private static final FileLogger instance=new FileLogger();

    private FileLogger(){

    }


    public static FileLogger getInstance(){
            return instance;
    }


    @Override
    public void debug() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void error() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fatal() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void warn() {
        // TODO Auto-generated method stub
        
    }

    
    
}
