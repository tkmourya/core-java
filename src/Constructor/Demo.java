package Constructor;
// Local Chaining
public class Demo {
    Demo(){
        this("Deep");
        System.out.println("0-parameterized constructor");
    }
    Demo(String s){
        this(2,5);
        System.out.println("1-parameterized constructor");
    }
    Demo(int a,int b){
        System.out.println("2-parameterized constructor");
    }
}
class App2{
    public static void main(String[] args) {
        new Demo();
    }
}
