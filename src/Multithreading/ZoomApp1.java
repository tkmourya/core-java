package Multithreading;

public class ZoomApp1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("meeting has starting");
        JavaSession1 js1 = new JavaSession1();
        Thread t = new Thread(js1);
        t.start();
        t.join();
        System.out.println("meeting has ended");
    }
}
class JavaSession1 implements Runnable{
    public void run(){
        System.out.println("student have entered the meeting");
        for (int i=1;i<=5;i++){
            System.out.println("Students are attending meeting");
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Students have left the meeting");
    }
}
