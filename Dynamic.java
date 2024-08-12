import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  ArrayList<String> a = new ArrayList<>();
  a.add("Mahesh");
  a.add("Sai");
  a.add("Venkata");
  a.add("Sri");
  ListIterator<String> i = a.listIterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }
}
}
 class person{
    String name;
    person(String name){
            this.name = name;
     }
    }