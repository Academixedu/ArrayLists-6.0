import java.util.*;

public class Create
{
    void meth()
    {
      ArrayList<Object> arr=new ArrayList<>();

      arr.add("java");
      arr.add("is");
      arr.add(null);
      arr.add(45);
      arr.add(45);

      System.out.println("Size () : "+arr.size());

      Iterator <Object> it=arr.iterator();

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

  new Create().meth();
}
}
