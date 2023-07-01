package Multithreading_synchronized;

public class Library  {
    String res1 = "c book";
    String res2 = "algo book";
    String res3 = " Java book";
    public void  TharReads(){
        synchronized (res1){
            System.out.println("Thar has accessed "+ res1);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        synchronized (res2){
            System.out.println("Thar has accessed "+res2);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        synchronized (res3){
            System.out.println("Thar has accessed "+res3);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void lokiReads(){
        synchronized (res1){
            System.out.println("loki has accessed "+ res1);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        synchronized (res2){
            System.out.println("loki has accessed "+res2);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        synchronized (res3){
            System.out.println("loki has accessed "+res3);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class reading implements Runnable{
    public void run(){
        String tname = Thread.currentThread().getName();
        Library l = new Library();
        if(tname.equals("Thar")){
            l.TharReads();
        }
        else {
            l.lokiReads();
        }
    }
}
class App1{
    public static void main(String[] args) {
        reading r = new reading();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.setName("Thar");
        t2.setName("loki");
        t1.start();
        t2.start();
    }
}