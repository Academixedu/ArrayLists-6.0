import java.util.*;


public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  ArrayList<Person1> p1 = new ArrayList<>();
  p1.add(new Person1(97,534.43 ));
  p1.add(new Person1(793,382748 ));
  Iterator it = p1.iterator();
  while(it.hasNext())
  System.out.println(it.next());
}
}
