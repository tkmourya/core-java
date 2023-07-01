package collection_framework;

import java.util.Collections;
import java.util.Iterator;

//package collection_framework;
//
//
//interface Collection {
//    void add(int i);
//}
//
//interface List extends Collection {
//}
//
//interface Set extends Collection {
//}
//
//interface Queue extends Collection {
//}
//
//class ArrayList implements List {
//    private java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
//
//    @Override
//    public void add(int i) {
//        list.add(i);
//    }
//
//    @Override
//    public String toString() {
//        return list.toString();
//    }
//}
//
//class LinkedList implements List {
//    private java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
//
//    @Override
//    public void add(int i) {
//        list.add(i);
//    }
//
//    @Override
//    public String toString() {
//        return list.toString();
//    }
//}
//
//class ArrayDeque implements Queue {
//    private java.util.ArrayDeque<Integer> deque = new java.util.ArrayDeque<>();
//
//    @Override
//    public void add(int i) {
//        deque.add(i);
//    }
//
//    @Override
//    public String toString() {
//        return deque.toString();
//    }
//}
//
//class TreeSet implements Set {
//    private java.util.TreeSet<Integer> set = new java.util.TreeSet<>();
//
//    @Override
//    public void add(int i) {
//        set.add(i);
//    }
//
//    @Override
//    public String toString() {
//        return set.toString();
//    }
//}
//
//class HashSet implements Set {
//    private java.util.HashSet<Integer> set = new java.util.HashSet<>();
//
//    @Override
//    public void add(int i) {
//        set.add(i);
//    }
//
//    @Override
//    public String toString() {
//        return set.toString();
//    }
//}
//
//class LinkedHashSet implements Set {
//    private java.util.LinkedHashSet<Integer> set = new java.util.LinkedHashSet<>();
//
//    @Override
//    public void add(int i) {
//        set.add(i);
//    }
//
//    @Override
//    public String toString() {
//        return set.toString();
//    }
//}
//
//class MainApp {
//    public static void main(String[] args) {
//
//        List arrayList = new ArrayList();
//        arrayList.add(3);
//        arrayList.add(5);
//        arrayList.add(2);
//        arrayList.add(4);
//        System.out.println("ArrayList: " + arrayList);
//
//        List linkedList = new LinkedList();
//        linkedList.add(3);
//        linkedList.add(45);
//        linkedList.add(2);
//        linkedList.add(4);
//        System.out.println("LinkedList: " + linkedList);
//
//        Queue arrayDeque = new ArrayDeque();
//        arrayDeque.add(3);
//        arrayDeque.add(45);
//        arrayDeque.add(2);
//        arrayDeque.add(4);
//        System.out.println("ArrayDeque: " + arrayDeque);
//
//        Set treeSet = new TreeSet();
//        treeSet.add(3);
//        treeSet.add(45);
//        treeSet.add(2);
//        treeSet.add(4);
//        System.out.println("TreeSet: " + treeSet);
//
//        Set hashSet = new HashSet();
//        hashSet.add(3);
//        hashSet.add(45);
//        hashSet.add(2);
//        hashSet.add(4);
//        System.out.println("HashSet: " + hashSet);
//
//        Set linkedHashSet = new LinkedHashSet();
//        linkedHashSet.add(3);
//        linkedHashSet.add(45);
//        linkedHashSet.add(2);
//        linkedHashSet.add(4);
//        System.out.println("LinkedHashSet: " + linkedHashSet);
//    }
//}
public interface CollectionDemo  {
    
}
interface List extends CollectionDemo{

}
interface Set extends CollectionDemo{

}
interface Queue extends CollectionDemo{

}
class ArrayList implements List {


}
class LinkedList implements List{


}
class ArrayDeque implements List{


}
class TreeSet implements Set{


}
class HashSet implements Set{


}
class LinkedHashSet implements Set{


}
class PriorityQueue implements Queue {
    private java.util.PriorityQueue<Integer> queue = new java.util.PriorityQueue<>();
    public void add(int i) {
        queue.add(i);
    }

    public Iterator<Integer> iterator() {
        return queue.iterator();
    }

}
class mainApp implements CollectionDemo {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
    p.add(5);
    p.add(8);
    p.add(1);

        System.out.print("PriorityQueue elements: ");
        Iterator<Integer> it = p.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}