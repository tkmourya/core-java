package Encapsulation;
//no Security(Direct access available)
public class Bank {
    int amt = 5000;
}
class Hero{
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.amt);
    }
}
class Villain{
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.amt);
    }
}
