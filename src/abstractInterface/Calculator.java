package abstractInterface;

public interface Calculator {
    static void add() {
        System.out.println("j");
    }

    void sub();
    int a=30,b=4;
}
class calci implements Calculator{
    int a=10, b=5;
    public void add() {
        System.out.println(a+b);
    }

    @Override
    public void sub() {
        System.out.println(a-b);
    }
}
class calci2 implements Calculator{
//    int a,b;


    public void add() {
//        a=10;
//        b=5;
        System.out.println(a+b);
    }

    @Override
    public void sub() {
//    a=10;
//    b=5;
        System.out.println(a-b);
    }
}
class App{
    public static void main(String[] args) {
        calci c = new calci();
        c.add();
        c.sub();
        calci2 c1 = new calci2();
        c1.add();
        c1.sub();
    }
}