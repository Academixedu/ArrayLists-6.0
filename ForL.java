import java.util.ArrayList;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop

        ArrayList<String> list = new ArrayList<>();

        // Load Strings into the ArrayList
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // Iterate over the ArrayList using a for-each loop
        for (String language : list) {
            System.out.println(language);
        }
    }
}

