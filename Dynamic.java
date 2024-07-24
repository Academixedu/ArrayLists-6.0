import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  ArrayList<person> list = new ArrayList<person>();
  list.add(new person(24, "Vishal", "B+", "Male", "Delhi"));
  Iterator<person> itr = list.iterator();
  while(itr.hasNext()){
    System.out.println(itr.next());
  }
}
}
