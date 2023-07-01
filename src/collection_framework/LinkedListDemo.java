package collection_framework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add("deep");
        ll.add(3.14);
        ll.add(true);
        System.out.println(ll);
        ll.add("viru");
        ll.add(0,99);
        System.out.println(ll);
    }
}
