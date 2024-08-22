import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import ElevatorDesign.Elevator.Elevator;
import ElevatorDesign.ElevatorController.BasicElevatorController;
import ElevatorDesign.ElevatorController.Request.ElevatorCallRequest;
import ElevatorDesign.ElevatorController.Strategy.ElevatorStrategy;
import ElevatorDesign.ElevatorController.Strategy.FindNearestStrategy;
import Rought.Commom;
import Rought.Fan;

public class Main{

    // defining in your memebrs will have default value being initialsed
    static int a;

    static int plusMethod(int x, int y) {
        return x + y;
      }
      
      static double plusMethod(double x, double y) {
        return x + y;
      }

    public static void main(){
      // int[] arr=new int[]{1,2,3,5,7};
      //   List<Integer> data=new ArrayList<Integer>();
        
      //   for(int a:arr)data.add(a);

      //   // Collections.copy(new ArrayList<>(), data);

      Fan cr=new Commom();
      cr.switchOn();


      //  int[]result=data.stream().mapToInt(num->num).toArray();

      // //  for(int i=0;i<result.length;i++){
      // //   System.out.println(result[i]);
      // //  }

      //  HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

      //  map.put(2, 3);
      
      //   // another put methods ovverires the value.
      //  map.put(2, null);  

      
      //  System.out.println(map.get(2));


    

    }


}