import java.util.ArrayList;
import java.util.Iterator;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop

    ArrayList<person> myList = new ArrayList<person>();
    person p1 = new person("John", 25, 'A', 25000, 5000);
    person p2 = new person("Doe", 30, 'B', 35000, 6000);
    person p3 = new person("Smith", 35, 'C', 45000, 7000);
    myList.add(p1);
    myList.add(p2);
    myList.add(p3);

    Iterator<person> it = myList.iterator();
    while(it.hasNext()){
        person p = it.next();
        System.out.println(p.getName() + " " + p.getAge() + " " + p.getAge() + " " + p.getSalary() + " " + p.getBonus());
    }



}
}
