
import java.util.ArrayList;
import java.util.*;

public class Create{
public static void main(String[]args){


  ArrayList<Integer> ir = new ArrayList<>();
  ir.add(898);
  ir.add(9798);
  ir.add(87); ir.add(8948);
  ir.add(9798);
  ir.add(87);
  Iterator<Integer> it = ir.iterator();
  while(it.hasNext())
  System.out.println(it.next());
}
}


//Iterator<Byte> i=by.iterator();