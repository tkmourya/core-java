package collection_framework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(20);
        hs.add(10);
        hs.add(40);
        hs.add(30);
        hs.add(null);
        hs.add(20);
        System.out.println(hs); // [null, 20, 40, 10, 30]
    }
}
