import java.util.*;
public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  List<Integer> b=new ArrayList<Integer>();
  b.add(221);
  b.add(258);
  b.add(212);
  b.add(5);
  b.add(3);
 
  Iterator n=b.iterator();
  while (n.hasNext()) {
      System.out.println(n.next());
      
  }
  

}

}
