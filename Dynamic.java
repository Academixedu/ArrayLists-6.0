
import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  
  ArrayList<Person> List = new ArrayList<>();
  
  List.add(new Person (1,"Togar"));
  List.add(new Person (2,"Naveen"));
  List.add(new Person (3,"Togar"));
  Iterator<Person> i=List.iterator();
  while(i.hasNext()){
      System.out.println(i.next().toString());
  }
  
  
}
}
