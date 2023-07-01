package Maps;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(18, "virat");
        tm.put(7, "dhoni");
        tm.put(45, "rohit");
        tm.put(10, "sachin");
        System.out.println(tm); // {7=dhoni, 10=sachin, 18=virat, 45=rohit}
    }
}
