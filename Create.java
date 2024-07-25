import java.util.ArrayList;
import java.util.Iterator;

public class Create {
    public static void main(String[]args){

        ArrayList<String> chocolates= new ArrayList<String>();

        chocolates.add("Dairy milk");
        chocolates.add("Kitkat");
        chocolates.add("Milkybar");
        chocolates.add("Silk");

        Iterator<String> chocolateIterator=chocolates.iterator();
        while(chocolateIterator.hasNext()){
            System.out.println(chocolateIterator.next());
        }     
               
    }
    
}
