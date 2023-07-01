package collection_framework;

import abstractInterface.A;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList fruitlist = new ArrayList();
        fruitlist.add("mango");
        fruitlist.add("apple");
        fruitlist.add("pineapple");
        System.out.println(fruitlist); // [mango, apple, pineapple]
        ArrayList vegList = new ArrayList();
        vegList.add("potato");
        vegList.add("onion");
        System.out.println(vegList); // [potato, onion]
        ArrayList foodList = new ArrayList();
        foodList.add("pizza");
        foodList.addAll(fruitlist);
        System.out.println(foodList); // [pizza, mango, apple, pineapple]
        foodList.add(vegList);
        System.out.println(foodList); // [pizza, mango, apple, pineapple, [potato, onion]]
        System.out.println(foodList.get(4)); // [potato, onion]

    }
}
