import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  ArrayList<Object> arr=new ArrayList<>();
  arr.add(1);
  arr.add(2);
  arr.add(3);

  Iterator <Object> it=arr.iterator();
  while (it.hasNext()) 
  {
    System.out.println(it.next());  
  }
}
}
