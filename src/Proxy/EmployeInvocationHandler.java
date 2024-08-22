package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeInvocationHandler implements InvocationHandler {

    Em employee;

    public EmployeInvocationHandler(Em em){
        this.employee=em; 
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Method called");

        method.invoke(employee , args);

        return null;
    }



    
}
