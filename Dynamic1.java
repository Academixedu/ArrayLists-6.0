
import java.util.ArrayList;
import java.util.ListIterator;
class Dynamic1{
  String name;
      int age;
      double sal;
  
    public Dynamic1(String name,int age,double sal){
    this.name=name;
    this.age=age;
    this.sal=sal;
    }
  
public static void main(String[]args){
// Create an Object for ArrayList
ArrayList<Dynamic1> p=new ArrayList<>();

  // Load person class Objects in it
  p.add(new Dynamic1("Swarupa",21,20000.0));
  p.add(new Dynamic1("Chinnu",22,25000.0));

  // Iterate it by using List Iterator
  ListIterator<Dynamic1> iterator=p.listIterator();
  while (iterator.hasNext()) {
    Dynamic1 p1 =iterator.next();


  

    System.out.println("Name: " +p1.name +","+"Age: "+ p1.age +","+"Salary: "+ p1.sal );
      
  }
  // print the values by using while Loop
}

}

