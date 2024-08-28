import java.util.ArrayList;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop

    ArrayList<String> myList = new ArrayList<String>();
    myList.add("One");
    myList.add("Two");
    myList.add("Three");
    myList.add("Four");
    myList.add("Five");

    for(String s: myList){
        System.out.println(s);
    }
}
}
