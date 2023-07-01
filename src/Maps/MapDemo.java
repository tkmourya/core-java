package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(18,"virat");
        hm.put(7,"dhoni");
        hm.put(45,"rohit");
        hm.put(10,"sachin");
//        System.out.println("key: "+hm.keySet()); // key: [18, 7, 10, 45]
//        System.out.println("values: "+hm.values()); // values: [virat, dhoni, sachin, rohit]
//        System.out.println("entry set: "+hm.entrySet()); // entry set: [18=virat, 7=dhoni, 10=sachin, 45=rohit]

            Set s=hm.entrySet();
        Iterator itr=s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
