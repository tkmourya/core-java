package Abstract;

abstract public class Parent {
    abstract void fun1();
    abstract void fun2();
}
class Child1 extends Parent{
    // Overridden
    void fun1(){
        System.out.println("fun-1");
    }
    void fun2(){
        System.out.println("fun-2");
    }
}
abstract class Child2 extends Parent{
    // overridden and inherited
    void fun1(){
        System.out.println("fun-1");
    }
}
abstract class Child3 extends Parent{
    // inherited

}
class App{
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.fun1();
        c1.fun2();
        Child2 c2;// not call abstract only use

        Child3 c3;// not call

    }
}