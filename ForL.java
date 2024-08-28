import java.util.*;
public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  List<String> ls=new ArrayList<String>();
  ls.add(0,"strings");
  ls.add(1,"hekllo");
  ls.add(2,"kko");
  ls.add(3,"ljs");
  ls.add(4,"kp");
  Iterator it=ls.iterator();
  while(it.hasNext()){
System.out.println(it.next());
  }
}
}
