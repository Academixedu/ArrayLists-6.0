import java.util.ArrayList;
import java.util.Iterator;


public class Create{
public static void main(String[]args){
  ArrayList<Integer> a=new ArrayList<Integer>();
  a.add(2);
  a.add(5);
  a.add(34);
  a.remove(2);
  a.add(7);
  System.out.println(a.get(2));
  Iterator i=a.iterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
}
}
