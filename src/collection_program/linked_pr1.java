package collection_program;

import java.util.LinkedList;
import java.util.Scanner;

public class linked_pr1 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.addFirst(50); // adding first index
        l.addLast(999);  // last index
        l.remove();       // remove 50
        l.removeFirstOccurrence(30);  // specifically remove element
        System.out.println(l);
        for (Object dd : l) {
            System.out.println(dd);
        }
    }
}