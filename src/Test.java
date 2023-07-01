//public class Test
//{
//    public static void main(String[] args)
//    {
//        int a = 21;
//        int b = 3;
//        int y = a / b;
//        double x = a / b;
//        System.out.println(y);
//        System.out.println(x);
//    }
//}

import java.util.*;
class Threads extends Thread
{
    Thread t;
    Threads()
    {
        Thread t1 = new Thread(this,"Thread_One");
        Thread t2 = new Thread(this,"Thread_Two");
        t1.start();
        t2.start();
    }
    public void run()
    {
        System.out.print("Run()");
    }
}
class Main
{
    public static void main(String args[])
    {
        new Threads();
    }
}
