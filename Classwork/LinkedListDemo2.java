import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        staff.add("Tom");
        staff.add("Diana");
        staff.add("Harry");

        ListIterator<String> iterator = staff.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Tom")) {
                iterator.remove();
            }
        }

        // Print remaining staff
        for (String name : staff) {
            System.out.println(name);
        }
    }
}
