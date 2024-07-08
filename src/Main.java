import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

      List<Integer> list=new ArrayList<Integer>();
     
      for(int i=0;i<10;i++)list.add(i);

      final long count=list.stream().filter((Integer val)->val>=2).count();

      System.out.println(count);
      


     
    }
}
