import java.util.ArrayList;

import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
ArrayList<Integer> al = new ArrayList<>();
  // Load Values in ArrayList
al.add(10);
al.add(20);
al.add(30);
al.add(40);
al.add(50);

  // Iterate it by usig Iterator and While Loops
  Iterator i=al.listIterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }
}
}
