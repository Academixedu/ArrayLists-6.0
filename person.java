public class person {
   private int id;
   private String  name;
   private char   d;
public int getA() {
    return id;
}
public void setA(int a) {
    this.id = a;
}
public String getS() {
    return name;
}
public void setS(String s) {
    this.name = s;
}
public char getD() {
    return d;
}
public void setD(char d) {
    this.d = d;
}
public person(int a, String s, char d) {
    this.id = a;
    this.name = s;
    this.d = d;
}
public person() {
}
@Override
public String toString() {
    return "person [a=" + id + ", s=" + name + ", d=" + d + "]";
}
   } 

