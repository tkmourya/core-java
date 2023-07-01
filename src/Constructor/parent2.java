package Constructor;

public class parent2 {
    parent2(){
        this(2,4);
        System.out.println("0-parameter constructor of parent");
    }
    parent2(int a, int b){
        System.out.println("2-parameter constructor of parent");
    }
}
class child2 extends parent2{
    child2(){
        this(8,9);
        System.out.println("0-parameter constructor of child");
    }
    child2(int a, int b){
        System.out.println("2-parameter constructor of child");
    }
}
class App4{
    public static void main(String[] args) {
        new child2();
    }
}
