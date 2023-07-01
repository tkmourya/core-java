package Exceptions;

import java.util.Scanner;

// How Exception behave  in case of multiple methods hierarchy
public class test4 {
    // use try catch block fix Exception
    public void fun1(){
            System.out.println("Fun 1 is starting");
//       try {
                fun2();
//            }catch (Exception e){
//                System.out.println("Exception handled by fun 1");
//            }
            System.out.println("Fun 1 is ending");

    }
    public void fun2(){
            System.out.println("Fun 2 is starting");
        try{
            fun3();
            }catch (Exception e){
                System.out.println("Exception handled by fun 2");
            }
            System.out.println("Fun 2 is ending");
    }
    public void fun3(){
        System.out.println("Fun 3 is starting");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
            int n = sc.nextInt();
        System.out.println("Square = " + (n * n));
        System.out.println("Fun 3 is ending");
    }
    public static void main(String[] args) {
        System.out.println("main() is starting");
        test4 t = new test4();
        t.fun1();
        System.out.println("main() is ending");
    }
}