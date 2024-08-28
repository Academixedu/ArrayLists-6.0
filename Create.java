import java.util.*;
public class Create{
  public static void main(String[]args){
    int[]a=new int[5];
    List<Integer> l=new ArrayList<Integer>();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    l.add(50);
    l.add(60);
    Iterator i=l.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
  }
}
