import java.util.ArrayList;
import java.util.ListIterator;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop

  ArrayList<Person> p=new ArrayList<>();
  p.add(new Person("Kashifa",21));
  p.add(new Person("Wasifa",23));
  p.add(new Person("Sai",23));
  p.add(new Person("Keerthi",21)); 

  ListIterator<Person> it=p.listIterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }


  }


}

