public class Person {

    public String name;
    public int sal;
    public int age;

    public Person(String name,int sal, int age){
        this.name=name;
        this.sal=sal;
        this.age=age;
    }

    public String toString(){
        return name+" "+sal+" "+age;
    }

}
