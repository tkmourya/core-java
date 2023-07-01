package collection_framework;

import java.util.PriorityQueue;

public class PriorityQueuedemo {
    public static void main(String[] args) {
        PriorityQueue pq1 = new PriorityQueue();
        pq1.add(100);
        pq1.add(30);
        pq1.add(5);
        pq1.add(10);
        PriorityQueue pq2 = new PriorityQueue();
        pq2.add("Kriti");
        pq2.add("aalia");
        pq2.add("deepika");
        pq2.add("katrina");
//        pq2.add(12);  // ClassCastException PriorityQueue
        System.out.println(pq1);
        System.out.println(pq2);

    }
}
