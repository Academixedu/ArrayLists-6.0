import java.util.*;
import javax.crypto.KEM;
import javax.xml.validation.Validator;
public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
   List<person> v=new ArrayList<person>();
   
 v.add(new person(1 ,"arbaz",'f'));
   


// private List<person> v;
Iterator<person> k=v.iterator();
while(k.hasNext()){
  System.out.println(k.next());
}

}


}