import java.util.ArrayList;
import java.util.ListIterator;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  ArrayList<person> p=new ArrayList<>();
   p.add(new person("pavan", 13));
  p.add(new person("Manish", 7));
  p.add(new person("Rutu", 10));
  p.add(new person("Bhargav", 14));
  ListIterator<person> v=p.listIterator();
  while(v.hasNext()){
    System.out.println(v.next());
  }
}
}
