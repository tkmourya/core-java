package Multithreading_synchronized;

public class starThread{
    public void  run(){
//        synchronized (this){
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
//                try{
//                    Thread.sleep(1000);
//                }catch (Exception e){
//                    e.printStackTrace();
                }
                System.out.println();
            }
        }
    }
//}
class NumThread {
    public void run(){
//        synchronized (this){
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
//                try {
//                    Thread.sleep(1000);
//                }catch (Exception e){
//                    e.printStackTrace();
            }
                System.out.println();
            }
        }
    }
//}
class printApp{
    public static void main(String[] args) {
        starThread st = new starThread();
        NumThread nt = new NumThread();
        st.run();
        nt.run();
//        st.start();
//        nt.start();
    }
}
