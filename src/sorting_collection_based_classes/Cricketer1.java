package sorting_collection_based_classes;

import java.util.ArrayList;
import java.util.Collections;

public class Cricketer1 implements Comparable{
    int jersey;
    String name;
    String team;
    public Cricketer1(int jersey,String name,String team){
        this.jersey=jersey;
        this.name=name;
        this.team=team;
    }

    @Override
    public String toString() {
        return "Cricketer1{" +
                "jersey=" + jersey +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';

    }

    @Override
    public int compareTo(Object o) {
        if (this.jersey > ((Cricketer1) (o)).jersey) {
            return 1;
        }
//        else if
//        (this.jersey < ((Cricketer1) (o)).jersey){
//            return -1;
//        }
        else {
            return -1;
        }
        }
    }
class Cricketer1App{
    public static void main(String[] args) {
        Cricketer1 c1 = new Cricketer1(18,"Virat","rcb");
        Cricketer1 c2 = new Cricketer1(45,"rohit","mi");
        Cricketer1 c3 = new Cricketer1(7,"dhoni","csk");
        ArrayList l = new ArrayList();
        l.add(c1);
        l.add(c2);
        l.add(c3);
        System.out.println(l); // [Cricketer1{jersey=18, name='Virat', team='rcb'}, Cricketer1{jersey=45, name='rohit', team='mi'}, Cricketer1{jersey=7, name='dhoni', team='csk'}]
        Collections.sort(l);
        System.out.println(l); // [Cricketer1{jersey=7, name='dhoni', team='csk'}, Cricketer1{jersey=18, name='Virat', team='rcb'}, Cricketer1{jersey=45, name='rohit', team='mi'}]

    }
}

