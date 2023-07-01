package collection_framework;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(5.99);
        list.add("Deep");
        list.add(true);
        System.out.println(list); // [10,5.99,Deep,true]
        System.out.println(list.contains(10)); // true
        System.out.println(list.contains(5.99)); // true
        System.out.println(list.get(2));         // Deep
        System.out.println(list.indexOf(5.99));  // 1
        System.out.println(list.indexOf(999)); // -1
        System.out.println(list.isEmpty());    // false
        System.out.println("original list : "+list); // Original list : [10,5.99,Deep,true]
        list.add(1,"Aalia");       // Not replace put in index 1 Aalia
        System.out.println("Updated list after using add : "+list); // Updated list after using add : [10, Aalia, 5.99, Deep, true]
        list.set(0,"batman");                                     // replace 10 to batman
        System.out.println("updated list after using set : "+list); // Updated list after using set : [batman, Aalia, 5.99, Deep, true]

    }
}
