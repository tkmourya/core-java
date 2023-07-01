package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class TreeSet1 {

        public static void main(String[] args)

        {

            TreeSet t = new TreeSet();

//            t.add(1);
//
//            t.add(42);
//
//            t.add(33);
//            t.add(4);
//            t.add(4);
t.add("iop");
//            t.pollLast();
            System.out.println(t.isEmpty()+" ");
            t.clear();
            System.out.println(t.isEmpty());
            System.out.print(t);
            System.out.println("------------------------------------");
//            PriorityQueue p = new PriorityQueue();
//
//            p.add(11);
//
//            p.add(2);
//
//            p.add(32);
//
//            p.add(4);
//
////            p.poll();
//            System.out.println(p);
//
//            System.out.print(p.contains(1));
//            System.out.println(t.equals(p));
            ArrayList h = new ArrayList();
            h.add("er");
            h.add("rt");
            h.add(0,"wq");
            h.add(1,"as");
            System.out.println(h);
            System.out.println("----------------");
            PriorityQueue l = new PriorityQueue();

            l.add(1);

            l.add(2);

            l.add(3);

//            l.add(4);
            l.remove();
            System.out.println(l);
            System.out.println(l.peek());
            System.out.println(l.poll());
            l.clear();
            System.out.println(l);
            System.out.println("-----iterator-------------");
            Iterator value = l.iterator();
            while(value.hasNext())
            {
                System.out.print(value.next());
            }
        }
}


