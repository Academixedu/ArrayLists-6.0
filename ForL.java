
  import java.util.ArrayList;
public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  ArrayList<String> stringList = new ArrayList<>();

      
        stringList.add("rabit");
        stringList.add("lion");
        stringList.add("horse");
        stringList.add("cheetha");
        

        
        for (String animal : stringList) {
            
            System.out.println(animal);
        }
    }

}

