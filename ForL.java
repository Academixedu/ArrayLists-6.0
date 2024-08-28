import java.util.ArrayList;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  ArrayList<String> string= new ArrayList<String>();
  string.add("cat");
  string.add("dog");
  string.add("rat");

  for(String animals : string) {
    System.out.println(animals);
  }
   
  
}
}
