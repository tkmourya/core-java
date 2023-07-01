package abstractInterface;

public interface Calci3 {
    void add();
    void sub();
}
interface Calci4 extends Calci3{
    void mul();
    void div();
}
class calculator implements Calci4 {
    double a=4,b=5;
    @Override
    public void add() {
        System.out.println(a+b);
    }

    @Override
    public void sub() {
        System.out.println(a-b);
    }

    @Override
    public void mul() {
        System.out.println(a*b);
    }

    @Override
    public void div() {
        System.out.println(a/b);
    }
}
class App3{
    public static void main(String[] args) {
        calculator c = new calculator();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}