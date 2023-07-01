package collection_program;

import java.util.HashMap;

public class hashmap_pr1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        //add element
        hm.put(1,10);
        hm.put(2,10);
       // get element
        System.out.println(hm.get(2));
        System.out.println(hm);
    }
}
