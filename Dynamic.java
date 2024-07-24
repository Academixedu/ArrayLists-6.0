import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic {
  public static void main(String[] args) {
    // Create an Object for ArrayList
    // Load person class Objects in it
    // Iterate it by using List Iterator
    // print the values by using while Loop
    ArrayList<Person> list = new ArrayList<>();
    list.add(new Person("chaitanya", 21));
    list.add(new Person("chaitu", 21));

    Iterator<Person> it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
