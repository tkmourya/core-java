package Multithreading;

public class JavaSession implements Runnable{
    public void run(){
        String name = Thread.currentThread().getName();
        for (int i=1;i<=5;i++){
            System.out.println(name+" is watching java session");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class ZoomApp{
    public static void main(String[] args) {
        JavaSession js = new JavaSession();
        Thread t1 = new Thread(js);
        Thread t2 = new Thread(js);
        t1.setName("Tarun");
        t2.setName("Ashoka");
        t1.start();
        t2.start();
    }
}
