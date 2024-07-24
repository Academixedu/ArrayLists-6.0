import java.util.ArrayList;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  ArrayList<String> a=new ArrayList<String>();
  a.add("hello world!");
  a.add("pratap");
  a.remove(0);
  a.add("prasad");
  a.add("naidu");
  for(String str:a){
    System.out.println(str);
  }
}
}
