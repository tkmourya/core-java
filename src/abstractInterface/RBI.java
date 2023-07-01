package abstractInterface;

public interface RBI {
    abstract void giveLone();
    static void currency(){
        System.out.println("INR");
    }
     default void demonetize(){
         System.out.println("Demonetize 500 1000 currency");
    }
}
class SBI implements RBI {

    @Override
    public void giveLone() {
        System.out.println("lone rate of 7%");
    }
//    @Override
//    public void demonetize() {
//        System.out.println("d");
//    }
}
class ICICI implements RBI{

    @Override
    public void giveLone() {
        System.out.println("lone rate of 8%");
    }
}
class PNB implements RBI{

    @Override
    public void giveLone() {
        System.out.println("lone rate of 7.5%");
    }
}
class Bank{
    public static void main(String[] args) {
        SBI s = new SBI();
//        RBI.currency();
//        s.giveLone();
//        s.demonetize();
        ICICI i = new ICICI();
//        RBI.currency();
//        i.giveLone();
//        i.demonetize();
        PNB p = new PNB();
//        RBI.currency();
//        p.giveLone();
//        p.demonetize();

// -Achieving 1:3 means polymorphism achieved this programme
        Ban(s);
        Ban(i);
        Ban(p);
    }
    public static void Ban(RBI b){
        RBI.currency();
        b.giveLone();
        b.demonetize();
    }
}
