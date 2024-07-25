import java.util.ArrayList;
import java.util.Iterator;

public class Create {
    public static void main(String[] args) {
        ArrayList<String> sport  = new ArrayList<>();

        sport .add("cricket ");
        sport.add("volleyball");
        sport.add("badminton");
        sport.add("football");
        sport.add("hockey");

        Iterator<String> i = sport.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}