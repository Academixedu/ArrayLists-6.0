import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.text.html.HTMLDocument;
public class Dynamic{
public static void main(String[]args){
  List<person> n=new ArrayList<person>();
  n.add(new person(1,"shu",'t'));
 Iterator<person>k=n.iterator();
 while(k.hasNext()){
  System.out.println(k.next());
 }



// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  
}
}
