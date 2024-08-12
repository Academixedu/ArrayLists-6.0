import java.util.ArrayList;

public class ForL1{
public static void main(String[]args){
// prepare an object for ArrayList
ArrayList<String> str=new ArrayList<>();
  // Load String instead of Integers 
  str.add("pavs");
  str.add("gani");
  str.add("rams");
  str.add("jaya");

  // Iterate them using for each loop
  for(String names:str){
  System.out.println(names);
  }


}
}