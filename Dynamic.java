import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
ArrayList<Person> arr=new ArrayList<>();
Person obj1=new Person("Abhishek", 120000, 22);
Person obj2=new Person("Sarvesh", 100000, 21);
arr.add(obj1);
arr.add(obj2);
arr.add(new Person("Ram",50000,22));
Iterator<Person>it=arr.iterator();
while (it.hasNext()) {
  System.out.println(it.next());
}





}
}
