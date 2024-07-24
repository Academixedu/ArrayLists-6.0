import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Dynamic{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  ArrayList<Person> a1=new ArrayList<Person>();
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  Person p=new Person("pratap",123 ,45000);
  a1.add(p);

  a1.add(new Person("ravi", 456, 40000));

  Person p1=new Person();
  Person p2=new Person();

  System.out.println("enter name");
  String n=sc.nextLine();
  System.out.println("enter id");
  int id=sc.nextInt();
  System.out.println("enter salary");
   int s=sc.nextInt();

   p1.setName(n);
   p1.setId(id);
   p1.setSal(s);
   a1.add(p1);

  //  System.out.println(p);
  //  System.out.println(p.getId());

   p2.setName("prasad");
   p2.setId(678);
   p2.setSal(70000);
  //  System.out.println(p2.toString());
   a1.add(p2);

  Iterator i=a1.listIterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }
  System.out.println(a1.get(1));
  sc.close();
 }
 
}
