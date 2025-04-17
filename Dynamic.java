import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dynamic{
public static void main(String[]args){


  List <Person>k=new ArrayList<Person>();
  
  k.add(new Person(1, "Rohit", 3465));
  k.add(new Person(1, "mohit", 321456));
  k.add(new Person(1, "nanda", 786578426));
  k.add(new Person(1, "surendra", 326745765));

   Iterator<Person> l=k.iterator();
   while (l.hasNext()) {
    System.out.println(l.next());
    
   }
  
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
}
}
