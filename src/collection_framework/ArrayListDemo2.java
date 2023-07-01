package collection_framework;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> cricketer = new ArrayList<String>();
        cricketer.add("virat");
        cricketer.add("rohit");
        cricketer.add("smith");
        System.out.println(cricketer); // [virat, rohit, smith]
        ArrayList<String> foodballer = new ArrayList<>();
        foodballer.add("messi");
        foodballer.add("ronaldo");
        System.out.println(foodballer); // [messi, ronaldo]
        ArrayList<String> player = new ArrayList<>();
        player.addAll(cricketer);
        player.addAll(foodballer);
        player.add("nadol");
        System.out.println(player); // [virat, rohit, smith, messi, ronaldo, nadol]
        player.removeAll(foodballer);
        System.out.println(player); // [virat, rohit, smith, nadol]
        player.remove(2);
        System.out.println(player); // [virat, rohit, nadol]
        player.remove("virat");
        System.out.println(player); // [rohit, nadol]
    }
}
