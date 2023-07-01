package abstractInterface;

public interface Calculator1 {
    void add();
    void sub();
}
interface Calculator2{
    void mul();
    void div();
}
class calci1 implements Calculator1,Calculator2{
double a=4,b=6;
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
class App1{
    public static void main(String[] args) {
        calci1 c = new calci1();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}