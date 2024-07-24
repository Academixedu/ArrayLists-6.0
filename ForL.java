
import java.util.ArrayList;

public class ForL {
  public static void main(String[] args) {
    // prepare an object for ArrayList
    // Load String instead of Integers
    // Iterate them using for each loop
    ArrayList<String> list = new ArrayList<>();
    list.add("chaitanya");
    list.add("chaitu");
    for (String s : list) {
      System.out.println(s);
    }
  }
}
