package Encapsulation;
import java.util.Scanner;
public class Bank2 {
    private int amt = 5000;
    private int pin = 9873;
    public void setAmt(int pass, int a){
        if(pass==pin){
            amt = amt+a;

        }
        else{
            System.out.println("Invalid pin");
        }
    }
    public int getAmt(int pass){
        if(pass==pin){
            return amt;
        }
        else{
            System.out.println("Invalid pin");
            return 0;
        }
    }
}
class Hero3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter password");
        int pass = s.nextInt();
        System.out.println("Please enter amount");
        int amt = s.nextInt();
        Bank2 b = new Bank2();
//        int pass = 9873;
//        int amt =10000;
        b.setAmt(pass, amt);
        System.out.println("Balance=" + b.getAmt(pass));
    }
}
//class villain3{
//    public static void main(String[] args) {
//        Bank2 b = new Bank2();
//        int pass = 1234;
//        b.setAmt(pass,10000);
//        System.out.println("balance="+b.getAmt(pass));
//    }
//}