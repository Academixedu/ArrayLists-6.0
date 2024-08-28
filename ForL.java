import java.util.*;
public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  List<String> b=new ArrayList<String>();
  b.add("e");
  b.add("ee");
  b.add("eee");
  b.add("eeeee");
  b.add("eeeeeee");
  b.add("eeeeeeee");
  // Iterator k=b.iterator();
  for(String n:b){
    System.err.println(n);
  }

}
}
