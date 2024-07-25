import java.util.ArrayList;
import java.util.Iterator;
public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  ArrayList<Person>a=new ArrayList<>();
  // Load person class Objects in it
  Person p1=new Person("srija",18,"Banglore","1234567890");
  a.add(p1);
  a.add(new Person("rupasri",15,"vijayawada","9876543210"));
  // Iterate it by using List Iterator
  Iterator i=a.listIterator();
  
  // print the values by using while Loop
  while(i.hasNext()){
    System.out.println(i.next());
  }
  
}
}
