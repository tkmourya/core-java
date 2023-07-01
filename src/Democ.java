public class Democ {
    Democ(){
        System.out.println("democ con");
    }
}
class Demo2 extends Democ{
    Demo2(){
        System.out.println("Demo2");
    }
}
class Demo3 extends Demo2{
    Demo3(){
        super();
        System.out.println("Demo3 con");
    }
}
class App1{
    public static void main(String[] args) {
        new Demo3();
    }
}
