import java.util.*;
public class Create{

// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  public static void main(String[]args){
  
    List<Integer> l = new ArrayList<Integer>();
      
      l.add(3);
      l.add(4);
     
        Iterator k = l.iterator();
        while (k.hasNext()) {
            System.out.println(k.next());
        }
}

}
