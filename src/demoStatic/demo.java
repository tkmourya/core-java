package demoStatic;

public class demo
{
    static int a, b;
    int x,y;
    public static void fun1()
    {
        System.out.println("static method");
    }
    public void fun2()
    {
        System.out.println("non-static method");
    }
    static
    {
        System.out.println("static block");
    }
    {
        System.out.println("non-static block");
    }
    demo() //constructor
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        demo d = new demo();
        d.fun2();
        demo.fun1();

    }
}
