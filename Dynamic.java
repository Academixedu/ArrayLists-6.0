import java.util.ArrayList;
import java.util.Iterator;

public class prac {
    public static void main(String[] args) {
        
        ArrayList<Integer> r = new ArrayList<>();
        r.add(10);
        r.add(20);
        r.add(30);
       r.add(40);
        Iterator i =r.listIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
