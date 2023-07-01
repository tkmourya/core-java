package Maps;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(23);
        v.add("you");
        v.add('d');
        v.add(56.3);
        System.out.println(v); // [23, you, d, 56.3]l
        // using Iterator-------------------------------------
        Iterator itr= v.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        // using--> Enumeration(interface) elements(iterator)
        Enumeration en = v.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        // using each loop-------------------------------------
        for (Object o : v) {
            System.out.println(o);
        }
    }
}
