package Exceptions;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array size");
        int size = sc.nextInt();
        // user enter a = 5 normally execute
        // user enter a = -5 throw (NegativeArraySizeException)  because array negative size not accept fix this Exception by using try{} catch(){} block
        // below use try catch block for fixing Exception
        try {
            int[] a = new int[size];
            System.out.println("length array = "+a.length);
        }catch (Exception e){
            System.out.println("Exception handled by try catch block");
        }

        System.out.println("Program starts");
    }
}
