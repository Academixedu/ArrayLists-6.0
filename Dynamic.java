import java.util.*;
public class Dynamic{
  // Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
public static void main(String[]args){
  ArrayList<person> p=new ArrayList<person>();
  p.add(new person(1,"ab",'f'));
  p.add(new person(2,"cd",'m'));
  ListIterator<person> iterator = p.listIterator();
  while(iterator.hasNext()){
    person person=iterator.next();
    System.out.println("Id: "+person.getPid()+ " , Name:" +person.getPname() + ", Gender: " + person.getPgender());
  }
  
  


}
}
