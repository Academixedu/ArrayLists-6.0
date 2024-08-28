import java.util.*;
public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  List<String> l=new ArrayList<String>();

  l.add(0,"marsh");
  l.add(1,"mello");

  Iterator t=l.iterator();
  while(t.hasNext()){
System.out.println(t.next());
  }
}

}