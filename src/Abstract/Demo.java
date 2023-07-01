package Abstract;

public abstract class Demo {
    int a, b;
    static int x, y;

    static {
        System.out.println("static  block");
    }

    {
        System.out.println("non static block");
    }

    public static void fun1() {
        System.out.println("static method");
    }

    public void fun2() {
        System.out.println("non static method");
    }
    // public abstract void fun3();
    public Demo() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
}
