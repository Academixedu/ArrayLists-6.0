import java.util.ArrayList;
import java.util.ListIterator;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Hemanth", 30));
        persons.add(new Person("Kamal", 25));
        persons.add(new Person("Konda", 35));
        ListIterator<Person> iterator = persons.listIterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            person.printDetails();
        }
    }
}
