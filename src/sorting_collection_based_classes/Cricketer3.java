package sorting_collection_based_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cricketer3 {
    int jersey;
    String name;
    String team;
    public Cricketer3(int jersey,String name,String team){
        this.jersey=jersey;
        this.name=name;
        this.team=team;
    }

    @Override
    public String toString() {
        return jersey+" "+name+" "+team;

    }
}
class SorterApp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(((Cricketer3)(o1)).jersey>((Cricketer3)(o2)).jersey){
            return 1;
        }
        else {
            return -1;
        }
    }
}
class Cricketer3App{
    public static void main(String[] args) {
        Cricketer3 c1 = new Cricketer3(18,"Virat","rcb");
        Cricketer3 c2 = new Cricketer3(45,"rohit","mi");
        Cricketer3 c3 = new Cricketer3(7,"dhoni","csk");
        ArrayList l = new ArrayList();
        l.add(c1);
        l.add(c2);
        l.add(c3);
        SorterApp sa = new SorterApp();
        System.out.println(l); // [18 Virat rcb, 45 rohit mi, 7 dhoni csk]
        Collections.sort(l,sa);
        System.out.println(l); // [7 dhoni csk, 18 Virat rcb, 45 rohit mi]

    }
}
