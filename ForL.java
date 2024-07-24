import java.util.ArrayList;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
ArrayList<String> al = new ArrayList<String>();
  // Load String instead of Integers 
  al.add("nani");
  al.add("hari");
  al.add("sai");
  al.add("satya");
  al.add("pavan");
  // Iterate them using for each loop
  for(int i=0;i<al.size();i++){
    System.out.println(al.get(i));
  }
}
}
