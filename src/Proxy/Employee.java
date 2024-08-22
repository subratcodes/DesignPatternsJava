package Proxy;

public class Employee implements Em {

   private int salary;
   
   private String name;


   public Employee(int salary, String name){
    this.salary=salary;
    this.name=name;
   }



@Override
public void someMethod() {
    // TODO Auto-generated method stub
    
}



public int getSalary() {
    return salary;
}


public void setSalary(int salary) {
    this.salary = salary;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


}
