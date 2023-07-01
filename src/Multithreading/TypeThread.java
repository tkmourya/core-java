package Multithreading;
// extends to the Thread class
public class TypeThread extends Thread {
    public void run(){
        System.out.println("Typing is starting");
        for(int i=1;i<=10;i++){
            System.out.println("Typing...");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class SyntaxThread extends Thread{
    public void run(){
        System.out.println("Syntax checking started");
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
class ThreadApp{
    public static void main(String[] args) {
        TypeThread tt = new TypeThread();
        SyntaxThread st = new SyntaxThread();
        tt.start();
        st.start();
    }
}