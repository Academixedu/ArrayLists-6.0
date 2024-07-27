import java.util.ArrayList;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  
ArrayList<Byte>by = new ArrayList<>();
by.add((byte)87);
by.add((byte)8l);
by.add((byte)-128);
by.add((byte) 0);

Byte b = by.get(2);
++b;
by.set(2, b);
for(int i:by)
System.out.println(i);
}
}
