package demoStatic;
class test
{
 static int a = 10;
 static int x = 100;
    static
    {
     a = 20;
     x = 200;
    }
    {
        a = 30;
        x = 300;
    }
    public static void fun1()
    {
        a = 40;
        x = 400;
       // System.out.println("fun1="+(a+x));
    }
    public void fun2()
    {
        a = 50;
        x = 500;
       // System.out.println(a);
    }

    public static void main(String[] args) {
        test t = new test();
        System.out.println("a="+test.a);//a=30
        System.out.println("x="+t.x);//x=300
        test.fun1();
        t.fun2();

    }
}
