public class person {
  private int pid;
  private String pname;
  private char pgender;

public person(int pid, String pname, char pgender ) {
    this.pid = pid;
    this.pname = pname;
    this.pgender = pgender;
    
}
public int getPid() {
    return pid;
}
public void setPid(int pid) {
    this.pid = pid;
}
public String getPname() {
    return pname;
}
public void setPname(String pname) {
    this.pname = pname;
}
public char getPgender() {
    return pgender;
}
public void setPgender(char pgender) {
    this.pgender = pgender;
}
}
