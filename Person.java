public class Person 
{
    String Name;
    int age;
    int sal;
      
    public Person(String Name,int age,int sal)
    {
        Name=Name;
        this.age=age;
        this.sal=sal;

    }

    @Override
    public String toString() {
        return "Person [Name=" + Name + ", age=" + age + ", sal=" + sal + "]";
    }
    
}
