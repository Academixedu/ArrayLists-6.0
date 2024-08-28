import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dynamic{
public static void main(String[]args){
  List<person>p=new ArrayList<person>();
  person p1=new person(1 , "arbaz", (char) 'M', 8639775733l);
  p.add(p1);

Iterator<person> t=p.iterator();
while (t.hasNext()) {
  System.out.println(t.next());
  
}
  
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
}
}
