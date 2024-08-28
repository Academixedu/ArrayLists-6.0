import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  ArrayList<person> a = new ArrayList<person>();
a.add(new person(1,"ssr"));

  Iterator<person> i = a.iterator();
  while (i.hasNext()) {
    System.out.println(i.next());
} 
}
}
