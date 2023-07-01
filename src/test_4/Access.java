package test_4;

public class Access {
    static int x=7;
    static {
        System.out.print("Static"+" ");
    }
    static void sum() {
        x = x+2;

    }
}
class Demo {
    public static void main(String[] args) {
        Access o1 = new Access();
        o1.x = 5;
        Access o2 = new Access();
        o2.x = 4;
        o2.sum();
        System.out.print(o1.x+" "+o2.x); }}


