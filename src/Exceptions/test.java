package Exceptions;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Program start");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("Please enter 2nd number");
        int n2 = sc.nextInt();
        // user enter n1 = 3, n2 = 3 normally execute
        // user enter n1 = 3, n2 = 0 throw (ArithmeticException) fix this Exception by using try{} catch(){} block
        // below use try catch block for fixing Exception
        try {
           int res = n1 / n2;
            System.out.println("result= " + res);
        } catch (Exception e) {
            System.out.println("Exception handled by using try catch block");
        }
        System.out.println("Program end");
    }
}
