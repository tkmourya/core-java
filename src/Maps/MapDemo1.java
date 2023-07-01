package Maps;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class MapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(111, "rahul");
        tm.put(12, "ram");
        tm.put(11, "lala");
        tm.put(31, "kishan");

        Set s = tm.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

