package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class collectionAll {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(5.99);
        list.add("Deep");
        list.add(true);
        list.add(10);
        list.add(null);
        System.out.println(list);
        System.out.println(list.get(5)); System.out.println("---------------------------------------------------------------");
//--------------------------------------------------------------------------
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add("deep");
        ll.add(3.14);
        ll.add(true);
        ll.add("deep");
        ll.add(null);
        System.out.println(ll);
        ll.add("viru");
        ll.add(0,99);
        System.out.println(ll); System.out.println("---------------------------------------------------------------");
 //-----------------------------------------------------------------------------------

        LinkedList lls = new LinkedList();
        lls.push(10);
        System.out.println(lls.peek());
        lls.push(20);
        lls.push(30);
        lls.push(40);
        System.out.println(lls.pop());
        System.out.println(lls.peek());
        lls.push(20);
        lls.push(null);
        System.out.println(lls);
        System.out.println(lls.get(4)); System.out.println("---------------------------------------------------------------");
//---------------------------------------------------------------------------------
        PriorityQueue pq1 = new PriorityQueue();
        pq1.add(100);
        pq1.add(30);
        pq1.add(5);
        pq1.add(10);
        PriorityQueue pq2 = new PriorityQueue();
        pq2.add("Kriti");
        pq2.add("aalia");
        pq2.add("deepika");
        pq2.add("rts");
//        pq2.add(12);  // ClassCastException PriorityQueue
        System.out.println(pq1);
//        pq2.add(null); // not allow null
        System.out.println(pq2); System.out.println("---------------------------------------------------------------");

//--------------------------------------------------------------------------------------------------

        TreeSet ts1 = new TreeSet();
        ts1.add(40);
        ts1.add(20);
        ts1.add(50);
        ts1.add(10);
        System.out.println(ts1); // [10,20,40,50]
        TreeSet ts2 = new TreeSet();
        ts2.add("kriti");
//        ts2.add(null); // NullPointerException
        ts2.add("virat");
        ts2.add("virat");
        ts2.add("smith");
        ts2.add("deppika");
        ts2.add("aalia");
        ts2.add("aalia");
        System.out.println(ts2);
    }
}
