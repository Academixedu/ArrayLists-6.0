import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  List<Integer> l=new ArrayList<>();
l.add(1);
l.add(2);
l.add(3);
Iterator i=l.iterator();
while (i.hasNext()) {
  System.out.println(i.next());
}
}
}
