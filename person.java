import java.util.Iterator;

public class person {
    private int a;
    private String s;
    private char c;
    private long l;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }
    public char getC() {
        return c;
    }
    public void setC(char c) {
        this.c = c;
    }
    public long getL() {
        return l;
    }
    public void setL(long l) {
        this.l = l;
    }
    public person(int a, String s, char c, long l) {
        this.a = a;
        this.s = s;
        this.c = c;
        this.l = l;
    }
    public Iterator<person> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    @Override
    public String toString() {
        return "person [a=" + a + ", s=" + s + ", c=" + c + ", l=" + l + "]";
    }
   
    
}
