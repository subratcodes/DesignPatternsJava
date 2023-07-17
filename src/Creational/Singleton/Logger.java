package Creational.Singleton;

public class Logger {
    private static Logger variable;
    //the idea creating a private constructor is to make sure no can access it from the outside.
    private Logger(){

    }
    public static Logger getInstance(){
        if(variable==null) variable=new Logger();
        return variable;
    }



}
