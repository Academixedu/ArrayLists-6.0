public class Dynamic{
  class person {
      private String name;
      private int id;
  
      public void dyname(String name, int id) {
          this.name = name;
          this.id = id;
      }
  
      public String toString() {
          return name + id;
      }
  }
  public static void main(String[]args){
  // Create an Object for ArrayList
    // Load person class Objects in it
    // Iterate it by using List Iterator
    // print the values by using while Loop

    ArrayList<person> ls = new ArrayList<person>();
          person p = new person();
          p.dyname("marsh", 1);

          l.add(p);
          Iterator t = l.iterator();
          while (t.hasNext()) {
              person p1= (person) t.next();
              System.out.println(p1);
          }
  
    
  }
  }
