import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  int[]a=new int[5];
  a[3]=4;
  System.out.println(a[4]);
  List<Integer> l=new ArrayList<Integer>();
  l.add(1);
  l.add(2);
  Iterator i=l.iterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }
}
}
