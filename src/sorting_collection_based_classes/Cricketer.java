package sorting_collection_based_classes;

import java.util.ArrayList;
import java.util.Collections;

public class Cricketer {
    int jersey;
    String name;
    String team;
    public Cricketer(int jersey,String name,String team){
        this.jersey=jersey;
        this.name=name;
        this.team=team;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "jersey=" + jersey +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
class CricketerApp{
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer(18,"Virat","rcb");
        Cricketer c2 = new Cricketer(45,"rohit","mi");
        Cricketer c3 = new Cricketer(7,"dhoni","csk");
        ArrayList l = new ArrayList();
        l.add(c1);
        l.add(c2);
        l.add(c3);
        System.out.println(l); // [Cricketer1{jersey=18, name='Virat', team='rcb'}, Cricketer1{jersey=45, name='rohit', team='mi'}, Cricketer1{jersey=7, name='dhoni', team='csk'}]
        Collections.sort(l);  // ClassCastException-->(we try to sort complex object using sort method, it generates ClassCastException)
        System.out.println(l);

    }
}