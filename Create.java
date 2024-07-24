import java.util.*;
public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  ArrayList<Object> a=new ArrayList<Object>();
  a.add(1);
  a.add("Chanakya Anna");
  a.add(929929939);
  Iterator i=a.listIterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }

}
}
