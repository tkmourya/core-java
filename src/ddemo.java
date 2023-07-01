
class ddemo {
    static int a;
    static int b;
    static int c=5;
    static void display1()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    int m;
    int n;
    int o;
    {
        m=400;
        n=500;
        o=600;
        a=700;
        b=800;
        c=900;
    }
    void display2()
    {
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
class studApp
{
    public static void main(String[] args)
    {
        ddemo dd = new ddemo();
       // dd.display2();
       ddemo.display1();
    }
}