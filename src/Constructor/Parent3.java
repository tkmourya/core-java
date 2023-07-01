package Constructor;
// super. keyword use
public class Parent3 {
    int x = 100;
    public void  fun(){
        System.out.println("parent fun");
    }
}
// child class inherited parent class-->
class Child3 extends Parent3{
    int x = 200;
    public void fun(){
        System.out.println("child fun");
    }
    public void display(){
        System.out.println("child="+x);
        fun();
        System.out.println("parent3="+super.x); // new prent().x -->// super keyword call x variable
        super.fun(); // new parent().fun() -->// super keyword call parent fun() method
    }
}
class App5{
    public static void main(String[] args) {
       Child3 c = new Child3();
       c.display(); // call display method
    }
}
