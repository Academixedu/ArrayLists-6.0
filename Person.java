public class Person {
    private int pid;
    private String pname;
    private char gen;
  
    public int getPid() {
      return pid;
    }
    public String getPname() {
      return pname;
    }
    public char getGen() {
      return gen;
    }
    public Person(int pid, String pname, char gen) {
      this.pid = pid;
      this.pname = pname;
      this.gen = gen;
    }
}