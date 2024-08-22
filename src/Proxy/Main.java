package Proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args){

        Em emp=new Employee(2, "Subrat");

        EmployeInvocationHandler empHandler=new EmployeInvocationHandler(emp);
 
        Object obj=Proxy.newProxyInstance(Employee.class.getClassLoader(), new Class[]{Employee.class}, empHandler);
        
        

    


    }
    
}
