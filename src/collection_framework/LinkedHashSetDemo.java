package collection_framework;

import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(40);
        lhs.add(10);
        lhs.add(20);
        lhs.add(50);
        lhs.add(30);
        lhs.add(null);
        lhs.add(40);
        System.out.println(lhs); // [40, 10, 20, 50, 30, null]
    }
}
