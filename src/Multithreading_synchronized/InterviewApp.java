package Multithreading_synchronized;

public class InterviewApp {
    public static void main(String[] args) {
        Interview task = new Interview();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.setName("Aalia");
        t2.setName("Anushka");
        t3.setName("Deep");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Interview implements Runnable{
    synchronized public void run(){
        String tname = Thread.currentThread().getName();
        for (int i=1;i<=5;i++){
            System.out.println(tname+" giving interview ");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
