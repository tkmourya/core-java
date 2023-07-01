package collection_framework;

import java.util.ArrayList;

public class ArrayListDouble {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1.56);
        list.add(3.88);
        list.add(4.83);
        list.add(5.3);
        for(Object listd: list){
            System.out.println(listd);
        }
    }
}
