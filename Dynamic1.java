import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic1{
public static void main(String[]args){
  ArrayList<Person1> b=new ArrayList<Person1>();
  b.add(new Person1("ABC",21,1));
  b.add(new Person1("XYZ", 22, 2));
  b.add(new Person1("PQR", 23, 3));

  Iterator<Person1> it=b.iterator();

  while(it.hasNext()){
    System.out.println(it.next().toString());
  }
  
  


}
}
