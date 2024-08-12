import java.util.ArrayList;
import java.util.Iterator;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  ArrayList<String> a = new ArrayList<>();
    a.add("PASUPULETI");
    a.add("SRI VENKATA");
    a.add("SAI MAHESH");
    for(String s :a){
      System.out.println(s);
    }
}
}
