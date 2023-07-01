package sorting_collection_based_classes;

import java.util.ArrayList;
import java.util.Collections;

public class Cricketer2 implements Comparable {
    int jersey;
    String name;
    String team;
    public Cricketer2(int jersey,String name,String team){
        this.jersey=jersey;
        this.name=name;
        this.team=team;
    }

    @Override
    public String toString() {
        return jersey+" "+name+" "+team;

    }

    @Override
    public int compareTo(Object o) {
        return (this.name).
                compareTo(((Cricketer2)(o)).name);
        }
//        else if
//        (this.jersey < ((Cricketer1) (o)).jersey){
//            return -1;
//        }
//        else {
//            return -1;
//        }
    }

class Cricketer2App{
    public static void main(String[] args) {
        Cricketer2 c1 = new Cricketer2(18,"Virat","rcb");
        Cricketer2 c2 = new Cricketer2(45,"rohit","mi");
        Cricketer2 c3 = new Cricketer2(7,"dhoni","csk");
        ArrayList l = new ArrayList();
        l.add(c1);
        l.add(c2);
        l.add(c3);
        System.out.println(l); // [18 Virat rcb, 45 rohit mi, 7 dhoni csk]
        Collections.sort(l);
        System.out.println(l); // [18 Virat rcb, 7 dhoni csk, 45 rohit mi]

    }
}
