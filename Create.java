import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  ArrayList<Integer> numbersList = new ArrayList<>();

    
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        
        Iterator<Integer> iterator = numbersList.iterator();

        
        while (iterator.hasNext()) {
            
            System.out.println(iterator.next());
        }
    }
}
