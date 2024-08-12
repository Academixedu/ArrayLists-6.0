import java.util.ArrayList;
import java.util.Iterator;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  ArrayList <Object>arr=new ArrayList<>();
  arr.add("Java is Awesome");
  arr.add("Java is Good");
  arr.add(0,12);

  Iterator <Object> it=arr.iterator();
  for (Object ar : arr) 
  {
     System.out.println(ar);
  }

}
}
