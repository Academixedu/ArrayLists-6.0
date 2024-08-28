
  import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  ArrayList<Integer> numbersList = new ArrayList<>();

    
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        
        Iterator<Integer> iterator = numbersList.iterator();

        
        while (iterator.hasNext()) {
            
            System.out.println(iterator.next());
        }
    }
}


