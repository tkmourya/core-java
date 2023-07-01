package abstractInterface;

public interface A {
    void fun1();
    void fun2();
}
abstract class B{
    abstract void fun1();
    abstract void fun2();
}
class Test{
    public void fun(){
        System.out.println("0");
    }
}
class Demo extends Test implements A{
    public void fun1() {
        System.out.println("1");
    }
    public void fun2(){
        System.out.println("2");
    }

}
class C{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.fun1();
        d.fun2();
        d.fun();
    }
}
//class Demo extends B,Test{
//
//}