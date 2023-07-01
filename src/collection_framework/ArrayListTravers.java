package collection_framework;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.TreeSet;
public class ArrayListTravers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
        System.out.println("-----------------1-------------------");
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        for (int i = 0; i < ll.size(); i++)
            System.out.println(list.get(i));
        System.out.println("---------------------2-----------------------");
        ArrayDeque<Integer> d = new ArrayDeque<Integer>();
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.add(50);
        for (Object dd : d) {
           System.out.println(dd);
        }
        System.out.println("--------------------3------------------------");
        TreeSet<Integer> t = new TreeSet<>();
        t.add(10);
        t.add(20);
        t.add(30);
        t.add(40);
        t.add(50);
        for (Object tt : t) {
            System.out.println(tt);
        }
        System.out.println("-----------------------4-------------------------");
        ArrayList<Integer> col = new ArrayList<Integer>();
        col.addAll(list);
        Iterator<Integer> itr = col.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}