 import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
ArrayList<Integer>s=new ArrayList<>();
s.add(2);
s.add(4);
s.add(6);
Iterator<Integer> it = s.iterator();
while (it.hasNext()) {
  System.out.println(((java.util.Iterator<Integer>) it).next());
}
}
}
