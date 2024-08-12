 import java.util.ArrayList;
import java.util.Iterator;
public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
ArrayList<Person> s=new ArrayList<>();
s.add(new Person("swaroopa",21));
s.add(new Person("swa",21));
Iterator<Person>it=s.iterator();
while(it.hasNext()){
  System.out.println(it.next());
}
}
}
