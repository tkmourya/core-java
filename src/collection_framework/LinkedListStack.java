package collection_framework;

import java.util.LinkedList;

public class LinkedListStack {
    public static void main(String[] args) {
        LinkedList lls = new LinkedList();
        lls.push(10);
        System.out.println(lls.peek());
        lls.push(20);
        lls.push(30);
        lls.push(40);
        System.out.println(lls.pop());
        System.out.println(lls.peek());
        System.out.println(lls);
        System.out.println(lls.get(0));
    }
}
