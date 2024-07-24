import java.util.ArrayList;
import java.util.Iterator; 
public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  ArrayList<String> list = new ArrayList<String>();
  list.add("Hello");
  list.add("This");
  list.add("Is");
  list.add("MY ArrayList");
  list.add("Assignment");

  Iterator load=list.listIterator();
  while(load.hasNext()){
    System.out.println(load.next());
  }

}
}
