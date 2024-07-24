import java.util.ArrayList;
import java.util.Iterator;
public class Create1{
public static void main(String[]args){

ArrayList<Integer> a=new ArrayList<Integer>();

a.add(100);
a.add(102);
a.add(103);
a.add(104);
System.out.println(a);
System.out.println("using  iterator");
Iterator it=a.iterator();
while(it.hasNext()){
System.out.println(it.next());

}
}
}