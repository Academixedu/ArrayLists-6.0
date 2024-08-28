import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by using Iterator and While Loops

    ArrayList<Integer> myList = new ArrayList<Integer>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);

  Iterator<Integer> it = myList.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }

}
}
