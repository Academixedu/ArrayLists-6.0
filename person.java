public class person {
    public String name;
    public int age;

    public person(String string, int age) {
        this.name = string;
        this.age =  age;
    }

    @Override
    public String toString() {
        return "person [name=" + name + ", age=" + age + "]";
    }
}