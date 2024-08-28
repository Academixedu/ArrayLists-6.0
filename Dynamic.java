import java.util.*;
public class Dynamic{
  public static void main(String[]args){
    List<Person> l=new ArrayList<>();
    l.add(new Person(1, "Revathi", 'F'));
    Iterator<Person> iterator =l.iterator();
    while(iterator.hasNext()){
      Person p=iterator.next();
      System.out.println("Id: "+p.getPid());
      System.out.println("Name: "+p.getPname());
      System.out.println("Gender: "+p.getGen());
    }
  }
}

