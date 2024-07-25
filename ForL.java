import java.util.ArrayList;

 class StringListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("carrot");
        list.add("orange");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
