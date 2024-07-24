import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  ArrayList<Integer> list = new ArrayList<Integer>();
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);
  list.add(6);
 Iterator<Integer> itr = list.iterator();
  while(itr.hasNext()){
    System.out.println(itr.next());
  }
}
}
