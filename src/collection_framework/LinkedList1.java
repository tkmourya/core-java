package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String args[])

    {

        LinkedList list = new LinkedList();
        list.add(5);

        list.add(7);

        list.add(2);

        list.add(10);
        list.remove();
        list.add(1,45);
        System.out.println(list); //[7, 2, 10]
        Iterator i = list.iterator();

        Collections.reverse(list);

//        i.next();



        while(i.hasNext())

            System.out.print(i.next() + " "); // 10 2 7
        ArrayList j = new ArrayList();
        j.add(8);
        j.add(0,7);
        j.add(1,9);
        System.out.println(j);
    }

}

