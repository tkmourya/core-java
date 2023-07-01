package Maps;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(18, "virat");
        lhm.put(7, "dhoni");
        lhm.put(45, "rohit");
        lhm.put(10, "sachin");
        System.out.println(lhm); // {18=virat, 7=dhoni, 45=rohit, 10=sachin}
    }
}
