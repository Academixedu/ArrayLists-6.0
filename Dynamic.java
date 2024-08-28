

  import java.util.ArrayList;
  import java.util.ListIterator;
  class Person {
    private String name;
    private int age;
  
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
  
   
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
  }
  public class Dynamic{
  public static void main(String[]args){
  // Create an Object for ArrayList
    // Load person class Objects in it
    // Iterate it by using List Iterator
    // print the values by using while Loop
    ArrayList<Person> personList = new ArrayList<>();
  
          
    personList.add(new Person("bhanu", 23));
    personList.add(new Person("mani", 23));
    personList.add(new Person("balu", 23));
  
    
    ListIterator<Person> listIterator = personList.listIterator();
    while (listIterator.hasNext()) {
      
        System.out.println(listIterator.next());
    }
  }
  }