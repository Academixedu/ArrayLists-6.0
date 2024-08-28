
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Create{
public static void main(String[]args){
  List<Integer> x= new ArrayList<Integer>();
  x.add(2);
  x.add(4);
  x.add(6);
  x.add(8);

  Iterator<Integer> ir = x.iterator();
  while (ir.hasNext()) {
    System.out.println(ir.next());
    
  }

// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
}
}

