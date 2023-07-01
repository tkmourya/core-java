package Multithreading;

public class Test {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setName("fun");
        System.out.println(Thread.currentThread().getName());
    }
}
