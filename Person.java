public class Person {
    private String pass;
    private int id;
    public Person(int id, String pass){
        this.id = id;
        this.pass = pass;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Person [pass=" + pass + ", id=" + id + "]";
    }

  
    }



    
    

