package collection_framework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
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
        System.out.println(ts2);

    }
}
