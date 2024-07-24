import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        // Creating an object of the LinkedList class
        LinkedList<String> ll = new LinkedList<>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        // Printing the linked list
        System.out.println(ll);

        // Removing elements from the linked list
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        // Printing the modified linked list
        System.out.println("after modifiying the linkedlist");
        System.out.println(ll);
    }
}
