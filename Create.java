import java.util.ArrayList;
import java.util.Iterator;

public class Create {
    public static void main(String[] args) {
     
        ArrayList<String> AL = new ArrayList<>();

       
        AL.add("1");
        AL.add("2");
        AL.add("3");
        AL.add("4");

     
        Iterator<String> iterator = AL.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}
