
import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  ArrayList<Integer> a = new ArrayList<>();
   a.add(24);
   a.add(22);
   a.add(20);
   a.add(18);
  Iterator<Integer> i = a.iterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }


}
}
