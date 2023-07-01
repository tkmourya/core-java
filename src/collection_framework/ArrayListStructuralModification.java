package collection_framework;

import java.util.ArrayList;

public class ArrayListStructuralModification {
    public static void main(String[] args) {
        ArrayList col = new ArrayList();
        col.add(10);
        col.add(20);
        col.add(30);
        col.add(40);
        col.add(50);
        for(int i=0; i<col.size();i++){
            System.out.println(col.get(i));
//            col.add(99);  // Structural modification is not possible in simple for loop
        }
        System.out.println("Enhance for loop-----------------");
        for(Object o:col){
            System.out.println(o);
            col.add(99);
            // Exception in thread "main" java.util.ConcurrentModificationException
        }
    }
}
