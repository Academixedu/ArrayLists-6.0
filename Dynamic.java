import java.util.ArrayList;
import java.util.Iterator;
public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
ArrayList<Person> al = new ArrayList<Person>();
  // Load person class Objects in it
  Person p1 = new Person("nani", 25, "vizag");
  al.add(p1);
  al.add(new Person("hari", 20, "viajayawada"));
  // Iterate it by using List Iterator
  Iterator<Person> i=al.listIterator();
  // print the values by using while Loop
  while(i.hasNext()){
    System.out.println(i.next());
}
}
}
