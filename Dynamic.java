import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic{

  void math(){

    ArrayList <Person> p=new ArrayList<>();

    Person obj1=new Person("sarvesh", 100000, 22);
      
     
      //passing an argument to LinkList
      p.add(obj1);
      p.add(new Person("Sarvesh",150000,22));

      System.out.println("-----------------------------");

      Iterator <Person> i=p.iterator();

      while (i.hasNext())
       {
          System.out.println(i.next());
      }
      

    }

  



public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  new Dynamic().math();    


}
}
