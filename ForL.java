import java.util.ArrayList;
import java.util.Iterator;

public class prac{
    public static void main(String[]args){
    // prepare an object for ArrayList
      // Load String instead of Integers 
      // Iterate them using for each loop
       ArrayList<String> s=new ArrayList<>();
       s.add("shashi");
       s.add("ravi");
       s.add("bharath");
       Iterator i=s.iterator();
       for(String e:s){
        System.out.println(s);
       }
    }
    }
