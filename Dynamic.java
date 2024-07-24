import java.util.ArrayList;
import java.util.ListIterator;

// Defining the Person class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Dynamic {
    public static void main(String[] args) {
        // Create an Object for ArrayList
        ArrayList<Person> list = new ArrayList<>();

        // Load person class Objects in it
        list.add(new Person("Bhairava", 35)); 
        list.add(new Person("Yaskin", 900));
        list.add(new Person("Ashwa", 6000));
        list.add(new Person("Sumati", 28));

        // Iterate it by using ListIterator
        ListIterator<Person> iterator = list.listIterator();

        // Print the values by using while Loop
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }
}
