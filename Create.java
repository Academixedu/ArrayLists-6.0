import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;

public class prac{
    public static void main(String[]args){
    // Create an Object for ArrayList
      // Load Values in ArrayList
      // Iterate it by usig Iterator and While Loops
      ArrayList<Integer> s=new ArrayList<>();
       s.add(3);
       s.add(002);
       s.add(0000003);
       s.add(0607);
      Iterator i=s.iterator();
     while(i.hasNext()){
        System.out.println(i.next());
     }
    }
    }
