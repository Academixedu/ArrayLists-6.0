import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  ArrayList<person> list = new ArrayList<>();
  person p1 = new person("siva", 24, "Delhi", "Male");
  person p2 = new person("shiva", 21, "kkd", "Male");
  list.add(p1);
  list.add(p2);

  Iterator load=list.listIterator();
  while(load.hasNext()){
    System.out.println(load.next());
  }
}}

   