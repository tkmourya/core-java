package producerConsumerProblem;

public class pizzaHouse1 {
    int pizzaNum;
    boolean baked = false;
    synchronized void bake(int t)throws InterruptedException{
        if(baked==true){
            wait();
        }
        else {
            pizzaNum=t;
            System.out.println("Baker produced pizza "+pizzaNum);
            baked=true;
            notify();
        }
    }
    synchronized void eat()throws InterruptedException{
        if(baked==false){
            wait();
        }
        else {
            System.out.println("Eater consumed pizza "+pizzaNum);
            baked=false;
            notify();
        }
    }
}
class pizzaApp1{
    public static void main(String[] args) {
        pizzaHouse1 ph = new pizzaHouse1();

    }
}