import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop

ArrayList<Person> arr=new ArrayList<>();
Person obj1=new Person("Shreyash",22,200000);
Person obj2=new Person("Ratan",22,200000);
arr.add(obj1);
arr.add(obj2);
arr.add(new Person("Astik",22,200));

Iterator <Person>it =arr.iterator();
while (it.hasNext())
 {
    System.out.println(it.next());  
}
}
}
