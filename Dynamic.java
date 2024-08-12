import java.util.ArrayList;
import java.util.ListIterator;

public class Dynamic{
  String name;
  int age;
  String gender;

  public Dynamic(String name, int age, String gender)
  {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
public static void main(String[]args){
  // Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop


  ArrayList<Dynamic> p = new ArrayList<>();
  p.add(new Dynamic("Sujatha", 21, "Female"));
  p.add(new Dynamic("sam", 20,"Male"));
  p.add(new Dynamic("sravya", 21,"Female"));

  ListIterator<Dynamic> iterator = p.listIterator();
  while (iterator.hasNext()) {
      Dynamic person = iterator.next();
      System.out.println("Name: " + person.name + ", Age: " + person.age + ", Gender: " + person.gender);
  }
}
}
