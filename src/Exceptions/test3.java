package Exceptions;

import java.util.Scanner;

// Q - How Exception behave  in case of multiple methods hierarchy
public class test3 {
    public void fun1(){
        System.out.println("Fun 1 is starting");
        fun2();
        System.out.println("Fun 1 is ending");
    }
    public void fun2(){
        System.out.println("Fun 2 is starting");
        fun3();
        System.out.println("Fun 2 is ending");
    }
    public void fun3(){
        System.out.println("Fun 3 is starting");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        // use try catch block for Exception fixing
        try {
            int n = sc.nextInt();
            System.out.println("Square = " + (n * n));
        }catch (Exception e){
            System.out.println("Exception handled by Fun 3");
        }
        System.out.println("Fun 3 is ending");
    }
    public static void main(String[] args) {
        System.out.println("main() is starting");
        test3 t = new test3();
        t.fun1();
        System.out.println("main() is ending");
    }
}
