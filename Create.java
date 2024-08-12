import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  
  ArrayList<Integer> arr = new ArrayList<>();
  arr.add(55);
  arr.add(94);
  arr.add(95);

  Iterator<Integer> iterator = arr.iterator();
  while (iterator.hasNext()) 
  {
      System.out.println(iterator.next());
  }

}
}
