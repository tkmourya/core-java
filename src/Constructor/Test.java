package Constructor;
// Constructor Overloading
public class Test {
    Test(){
        System.out.println("0-parameterized constructor");
    }
    Test(int a){
        System.out.println("1-parameterized constructor");
    }
    Test(int a,int b){
        System.out.println("2-parameterized constructor");
    }
}
class App1 {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(22);
        Test t3 = new Test(500,44);
    }
}
