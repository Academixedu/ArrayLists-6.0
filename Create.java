import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
ArrayList<Integer> a1=new ArrayList<>();

  // Load Values in ArrayList
  a1.add(2);
  a1.add(22);
  a1.add(33);

  // Iterate it by usig Iterator and While Loops
  Iterator i=a1.iterator();
  while (i.hasNext()) {
    System.out.println(i.next());


  }

}
}