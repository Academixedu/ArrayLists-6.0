public class Person 
{   
    String name;
    int sal;
    int age;

    public Person (String name,int sal,int age)
    {
        this.name=name;
        this.age=age;
        this.sal=sal;
               
    }

    @Override
    public String toString() 
    {
        return "Person [name=" + name + ", sal=" + sal + ", age=" + age + "]";
    }
    
    


    
}
