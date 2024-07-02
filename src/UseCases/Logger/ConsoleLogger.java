package UseCases.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConsoleLogger implements Logger {


    private static final ConsoleLogger instance=new ConsoleLogger();
    int logLevel=0;


    private static ConsoleLogger getConsoleLogger(){
        return instance;
    }


    private ConsoleLogger(){

    }

    
    public int getLogLevel() {
        return logLevel;
    }


    public void setLogLevel(int logLevel) {
        this.logLevel = logLevel;
    }


    private static String getTime(){

       return new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance()).toString();

    }

    @Override
    public void debug() {
       System.out.println("Console"+"debug"+getTime());
        
    }

    @Override
    public void error() {
        // TODO Auto-generated method stub
      

        System.out.println("Console"+"error"+getTime());
        
    }

    @Override
    public void fatal() {
        // TODO Auto-generated method stub

        System.out.println("Fatal Called"+"error"+getTime());
        
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub

        System.out.println("Info Loggs Called"+"info"+getTime());
        
    }

    @Override
    public void warn() {
        
        System.out.println("Warn  Called"+"warn"+getTime());
        
    }

    
    
}
