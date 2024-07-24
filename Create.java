
import java.util.ArrayList;
import java.util.Iterator;

public class Create {
  public static void main(String[] args) {
    // Create an Object for ArrayList
    // Load Values in ArrayList
    // Iterate it by usig Iterator and While Loops
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);
    list.add(5);
    Iterator<Integer> it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
