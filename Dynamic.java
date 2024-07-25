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

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Dynamic {
    public static void main(String[] args) {
       
        ArrayList<Person> PL = new ArrayList<>();

       
        PL.add(new Person("MEDHAS", 23));
        PL.add(new Person("CHARAN", 23));
       

       
        ListIterator<Person> LI =PL.listIterator();
        while (LI.hasNext()) {
            Person person = LI.next();
            System.out.println(person);
        }
    }
}
