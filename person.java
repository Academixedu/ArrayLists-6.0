public class person {
    public String name;
    public int id;
    
    public person(String string, int id) {
        this.name = string;
        this.id = id;
    }

    @Override
    public String toString() {
        return "person [name=" + name + ", id=" + id + "]";
    }
    
    
}
