import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
   ArrayList<Integer> i = new ArrayList<Integer>();
  // Load Values in ArrayList

     i.add(1);
     i.add(2);
     i.add(3);
     i.add(4);
     i.add(5);
  // Iterate it by usig Iterator and While Loops
    Iterator iterator = i.listIterator();

    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
}
}
