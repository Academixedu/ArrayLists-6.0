import java.util.ArrayList;
import java.util.Iterator;
public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
ArrayList<String>a=new ArrayList<String>();
  // Load String instead of Integers 
  a.add("Madhuri");
  a.add("Madhavi");
  a.add("Janu");
  a.add("Sujitha");  
  
  // Iterate them using for each loop
  for(int i=0;i<a.size();i++){
    System.out.println(a.get(i));
  }
}
}
