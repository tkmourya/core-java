package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Sorting_Collection_class {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(30);
        al.add(10);
        al.add(40);
        al.add(20);
        al.add(50);
        System.out.println("Original :"+al); // Original :[30, 10, 40, 20, 50]
  // sort by TreeSet class
        TreeSet ts = new TreeSet();
        ts.addAll(al);
        System.out.println("sorted :"+ts); // sorted :[10, 20, 30, 40, 50]
     // sort the element by Collections.sort() method
        Collections.sort(al);
        System.out.println("sorted by collection sort :"+ts); // sorted by collection.sort :[10, 20, 30, 40, 50]
    }
}
