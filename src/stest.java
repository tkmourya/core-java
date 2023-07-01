public class stest {
    static int a = 200;
     int b = 100;
     static int f;
     static int c;
     static {
         f = 30;
     }

    {
        f=10;
        c=23;
    }
    public static void th(){
        System.out.println();
        System.out.println(a); //static variable=a access
       // System.out.println(b); //non-static variable=b access

    }
    public void thh(){
        System.out.println(a);//static variable=a access
        System.out.println(b);//non-static variable=b access
    }
}

class sss{
    public static void main(String[] args) {
//        System.out.println(stest.f);
//        System.out.println(stest.c);
        stest t = new stest();
        t.a =300;
        t.a = 20;

        t.b =1001;
        t.thh();
        System.out.println(t.a);
        System.out.println(t.b);
        stest t1 = new stest();
        t1.a = 4;
        System.out.println(t1.a+" "+t1.b);
        stest.th();
        t1.thh();
    }
}
