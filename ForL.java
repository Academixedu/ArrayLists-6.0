import java.util.ArrayList;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
 
      ArrayList<String> I = new ArrayList<String>();
  // Load String instead of Integers 

      I.add("Apple");
      I.add("Ball");
      I.add("Cat");     
      I.add("Dog");
  // Iterate them using for each loop

     for(String string:I){

      System.out.println(string);
     }
}
}
