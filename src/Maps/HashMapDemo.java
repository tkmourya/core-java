package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(18,"virat");
        hm.put(7,"dhoni");
        hm.put(45,"rohit");
        hm.put(10,"sachin");
        System.out.println(hm); // {18=virat, 7=dhoni, 10=sachin, 45=rohit}
    }
}
