package Encapsulation;
//over Security
public class Bank1 {
    private int amt = 5000;
}
class Hero1{
    public static void main(String[] args) {
        Bank1 b = new Bank1();
       // System.out.println(b.amt);//error
    }
}
class Villain1{
    public static void main(String[] args) {
        Bank1 b = new Bank1();
        //System.out.println(b.amt);//error
    }
}
