import java.util.ArrayList;
import java.util.Iterator;
public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  ArrayList<Integer> List = new ArrayList<Integer>();
  List.add(1);
  List.add(2);
  List.add(77);
  Iterator<Integer> i=List.iterator();
  while(i.hasNext()){
      System.out.println(i.next());
  }
  System.out.println("While Loops");
}}