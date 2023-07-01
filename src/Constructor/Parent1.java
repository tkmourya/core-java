package Constructor;
// ex
public class Parent1 {
    Parent1(){
        System.out.println("0-parameter constructor of parent");
    }
    Parent1(int a,int b){
        System.out.println("2-parameter constructor of parent");
    }
}
class Child1 extends Parent1{
    Child1(){
        System.out.println("0-parameter constructor of child");
    }
    Child1(int a, int b) // 5  10
    {
       // super(20,2); // parent(20,2)
        System.out.println("2-parameter constructor of child");
    }
}
class App3{
    public static void main(String[] args) {
        new Child1(5,10);
    }
}
