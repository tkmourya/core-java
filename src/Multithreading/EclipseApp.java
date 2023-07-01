package Multithreading;

public class EclipseApp {
    public static void main(String[] args) {
        // creating task for the thread
        TypeThread1 tt = new TypeThread1();
        SyntaxThread1 st = new SyntaxThread1();
        // creating Threads
        Thread t1 = new Thread(tt);
        Thread t2 = new Thread(st);
        // starting Threads
        t1.start();
        t2.start();
    }
}
class TypeThread1 implements Runnable{
    public void run(){
        System.out.println("typing code has stared");
        for(int i=1;i<=10;i++){
            System.out.println("Typing code...");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class SyntaxThread1 implements Runnable{
    public void run(){
        System.out.println("Syntax checking has started ");
        for (int i=1;i<=10;i++){
            System.out.println("Syntax...");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
