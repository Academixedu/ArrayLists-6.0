import java.util.ArrayList;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  ArrayList<Integer> a=new ArrayList<>();
  // Load Values in ArrayList
  a.add(30);
  a.add(40);
  a.add(10);
  a.add(50);
  a.add(70);
  // Iterate it by usig Iterator and While Loops
  Iterator i=a.listIterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }

}
}
