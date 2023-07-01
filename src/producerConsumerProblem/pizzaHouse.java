package producerConsumerProblem;

public class pizzaHouse {
    int pizzaNum;
    public void bake(int t){
        pizzaNum=t;
        System.out.println("Baker produced pizza "+pizzaNum);
    }
    public void eat(){
        System.out.println("Eater consumed pizza "+pizzaNum);
    }
}
class Baker implements Runnable{
    pizzaHouse pz;
    Baker(pizzaHouse pz){
        this.pz=pz;
    }
    public void run(){
        int t=0;
        while (true){
            pz.bake(t++);
        }
    }
}
class Eater implements Runnable{
    pizzaHouse pz;
    Eater(pizzaHouse pz){
        this.pz=pz;
    }
    public void run(){
        while (true){
            pz.eat();
        }
    }
}
class pizzaApp{
    public static void main(String[] args) {
        pizzaHouse ph = new pizzaHouse();
        Baker b = new Baker(ph);
        Eater e = new Eater(ph);
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(e);
        t1.start();
        t2.start();
    }
}
