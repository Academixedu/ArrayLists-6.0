import java.util.*;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
ArrayList<String> al= new ArrayList<>();
  // Load String instead of Integers 
  al.add("janu");
  al.add("banu");
  al.add("manu");

  // Iterate them using for each loop
  for (String s:al){
    System.out.println(s);
}
}
}
