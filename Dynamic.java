import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic {
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
   ArrayList<person> d = new ArrayList<person>();
d.add(new person(1, "Vishal"));
d.add(new person(2, "vijay"));
d.add(new person(3, "khan"));
Iterator<person> ir = d.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
}
}
}
