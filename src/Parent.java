public class Parent {
    static void fun(){
        System.out.println("parent fun");
    }

}
class child extends Parent{
    static void fun(){
        System.out.println("child fun");
    }
}
class App{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.fun();
        child c = new child();
        c.fun();
        p=c;
//        Parent p1 = new child();
        p.fun();
    }
}
