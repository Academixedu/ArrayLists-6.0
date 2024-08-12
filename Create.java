
import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  ArrayList<Integer> in=new ArrayList();

  in.add(2);
  in.add(2);
  in.add(8);
  in.add(5);

  Iterator <Integer> it=in.iterator() ;

  while(it.hasNext()){
    System.out.println(it.next());
  }
    
  






}
}
