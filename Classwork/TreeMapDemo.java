import java.util.*;


class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.put(103, "Ravi"); 
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
