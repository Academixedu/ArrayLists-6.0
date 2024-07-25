import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList

     ArrayList<Person> p = new ArrayList<Person>();
  // Load person class Objects in it

        Person p1 = new Person(1, "Srinadh", "HYD");
        p.add(p1);
  // Iterate it by using List Iterator
   
        Iterator i = p.listIterator();
  // print the values by using while Loop

        while(i.hasNext()){
          System.out.println(i.next());
        }
}
}
