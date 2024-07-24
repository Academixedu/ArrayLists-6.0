import java.util.ArrayList;

public class ForL {
    public static void main(String[] args) {
        // Prepare an object for ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Load String instead of Integers
        list.add("Deva");
        list.add("Varadha");
        list.add("Charan");
        list.add("Rahul");

        // Iterate them using for each loop
        for (String item : list) {
            System.out.println(item);
        }
    }
}
