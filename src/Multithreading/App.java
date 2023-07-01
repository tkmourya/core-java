package Multithreading;

public class App {
    public static void main(String[] args) {
        System.out.println("typing code started");
        for(int i=1; i<=10; i++){
            System.out.println("type code...");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("checking syntax started");
        for(int i=1;i<=10;i++){
            System.out.println("checking syntax");
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
