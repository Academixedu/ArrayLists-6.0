import java.util.ArrayList;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  ArrayList<String> list = new ArrayList<String>();
  list.add(" Hi");
  list.add(" This");
  list.add(" Is");
  list.add("loding my ");
  list.add(" ArrayList");
  list.add(" Assignment using for each loop");
  for(String load:list)
  {
    System.out.println(load);
  }
}
}
