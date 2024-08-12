import java.util.*;

public class Dynamic
{
    void meth()
    {
      ArrayList<Person> al=new ArrayList<>();

      Person obj1=new Person("Ratan", 10000, 22);
      Person obj2 =new Person("Shreyas", 150, 22);

      al.add(obj1);
      al.add(obj2);
      al.add(new Person("sarvesh", 300, 22));

      Iterator <Person> it= al.iterator();

      while (it.hasNext())
       {
          System.out.println(it.next());
      }
   


    }

  public static void main(String[]args)
{
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop

  new Dynamic().meth();
}
}
