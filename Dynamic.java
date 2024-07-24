
import java.util.ArrayList;
import java.util.ListIterator;

public class Dynamic{
public static void main(String[]args){

  ArrayList<person> p=new ArrayList<>();
   p.add(new person("Mourya", 61));
 p.add(new person("Mani charan", 74));
  p.add(new person("Ruthwik", 103));
  p.add(new person("Bhuvan", 116));
  ListIterator<person> l=p.listIterator();
  while(l.hasNext()){
    System.out.println(l.next());
  }

}
}
