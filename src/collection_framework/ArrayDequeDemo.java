package collection_framework;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(5.33);
        ad.add("deep");
        ad.add(true);
        ad.add(10);
        System.out.println(ad);
        ad.addFirst("first");
        ad.addLast("Last");
        System.out.println(ad);
    }
}
