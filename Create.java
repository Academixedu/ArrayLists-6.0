import java.util.ArrayList;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  ArrayList<Integer> a=new ArrayList<>();
  // Load Values in ArrayList
  a.add(40);
  a.add(80);
  a.add(10);
  a.add(60);
  a.add(110);
  // Iterate it by usig Iterator and While Loops
  Iterator i=a.listIterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }

}
}
