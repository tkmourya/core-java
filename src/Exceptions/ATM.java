package Exceptions;
// below use throw keyword, finally block and try catch block.
import java.util.Scanner;
public class ATM {
    public void transaction(){
        System.out.println("Transaction started");
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter PIN");
            int pin = sc.nextInt();
            System.out.println("Correct pin !");
        }catch (Exception e){
            System.out.println("Exception handled by ATM");
            throw e;  // throw Exception object  caller method direct to method not next line execute but use finally block so execute first it.
        }
        finally {
            System.out.println("transaction ended");
        }
    }
}
class Bank{
    public void connect(){
        System.out.println("Connection with Bank established");
try {
    ATM a = new ATM();
    a.transaction();
}catch (Exception e){
    System.out.println("Exception info received by Bank");
}
        System.out.println("Connection with Bank terminated");
    }
}
class BankApp{
    public static void main(String[] args) {
        Bank b = new Bank();
        b.connect();
    }
}
