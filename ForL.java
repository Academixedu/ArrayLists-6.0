import java.util.ArrayList;
public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop

  ArrayList<String> chocolates= new ArrayList<String>();

        chocolates.add("Dairy milk");
        chocolates.add("Kitkat");
        chocolates.add("Milkybar");
        chocolates.add("Silk");

        for(String chocolate:chocolates){
        System.out.println(chocolate);
        }
}
}
