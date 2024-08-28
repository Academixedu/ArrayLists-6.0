public class person {
    private  int sid;
    private  String sname;
    private  char sgender;
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public char getSgender() {
        return sgender;
    }
    public void setSgender(char sgender) {
        this.sgender = sgender;
    }
    public person(int sid, String sname, char sgender) {
        this.sid = sid;
        this.sname = sname;
        this.sgender = sgender;
    }
    public person() {
    }
    @Override
    public String toString() {
        return "person [sid=" + sid + ", sname=" + sname + ", sgender=" + sgender + ", getSid()=" + getSid()
                + ", getSname()=" + getSname() + ", getSgender()=" + getSgender() +"]";
    }
    

}
