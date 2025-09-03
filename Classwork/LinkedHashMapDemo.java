import java.util.*;
class LinkedHashMapDemo {
 public static void main(String[] args) {
    LinkedHashMap<Integer, String> link = new LinkedHashMap<>();
    link.put(100, "Amit");
    link.put(101, "Vijay");
    link.put(102, "Rahul");
    link.put(103, "Ravi");

    System.out.println("LinkedHashMap contents:" + link);
    System.out.println("Elements inside Map Entry set:" + link.entrySet());
    System.out.println("Elements inside Map Key set:" + link.keySet());
    System.out.println("Elements inside Map Values set:" + link.values());
 }
    
}
