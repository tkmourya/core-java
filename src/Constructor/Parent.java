package Constructor;
//Constructor_chaining
public class Parent {
    Parent(){
        System.out.println("parent constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("child constructor");
    }
}
// class Child extends Parent{}
class App{
    public static void main(String[] args) {
        Child c = new Child();
    }
}
