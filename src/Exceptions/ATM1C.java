package Exceptions;

import java.util.Scanner;

public class ATM1C {
    public static void main(String[] args) throws InvalidPinException {
        ATM1 a = new ATM1();
        a.transaction();
    }
}
    class ATM1{
        public void transaction()throws InvalidPinException
        {
            int pin =9898;
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter pin !");
            int p = sc.nextInt();
            if(pin==p){
                System.out.println("congrats correct pin");
            }
            else {
                System.out.println("Invalid pin");
                InvalidPinException ie = new InvalidPinException();
                throw ie;
            }
        }
    }
    class InvalidPinException extends Exception
    {
        public String getMessage(){
            return "InvalidPinException occurred!";
        }
    }

