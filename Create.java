import java.util.ArrayList;
import java.util.Iterator;

public class Create {
    public static void main(String[] args) {
        ArrayList<String> course = new ArrayList<>();

        course.add("java");
        course.add("python");
        course.add("javascript");
        course.add("reactJS");

        Iterator<String> i = course.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
