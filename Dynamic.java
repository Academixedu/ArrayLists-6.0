import java.util.ArrayList;
import java.util.ListIterator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

 class PersonListExample {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("mohan", 20));
        people.add(new Person("krishna", 15));
        people.add(new Person("hari", 25));

        ListIterator<Person> listIterator = people.listIterator();
        
        while (listIterator.hasNext()) {
            Person person = listIterator.next();
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
