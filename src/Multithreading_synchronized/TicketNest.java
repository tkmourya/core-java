package Multithreading_synchronized;

public class TicketNest implements Runnable{
    public void run(){
        String tname = Thread.currentThread().getName();
        for (int i=1;i<=5;i++){
            System.out.println(tname+" is viewing movie options");
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        synchronized (this) {         // synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(tname + " is selecting seats");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        for (int i=1;i<=5;i++){
            System.out.println(tname+" is making payment");
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class App {
    public static void main(String[] args) {
        TicketNest tn = new TicketNest();
        Thread t1 = new Thread(tn);
        Thread t2 = new Thread(tn);
        Thread t3 = new Thread(tn);
        t1.setName("Spiderman");
        t2.setName("Ironman");
        t3.setName("Antman");
        t1.start();
        t2.start();
        t3.start();
    }
}