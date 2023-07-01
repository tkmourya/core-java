package collection_framework;

import java.util.concurrent.CopyOnWriteArrayList;

public class ArraylistStructuralModification1 {
    public static void main(String[] args) {
        CopyOnWriteArrayList col = new CopyOnWriteArrayList();
        col.add(10);
        col.add(20);
        col.add(30);
        col.add(40);
        col.add(50);
        for (Object o: col){
            System.out.println(o);
            col.add(99);
        }
        System.out.println(col);
    }
}
