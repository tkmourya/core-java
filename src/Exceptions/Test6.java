package Exceptions;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Test6 t = new Test6();
        try{
            t.beta();
        }catch (Exception e){
            System.out.println("Exception handled");
            e.printStackTrace();
        }
    }
    public void beta(){
        alpha();
    }
    public void alpha(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        System.out.println("Square="+(n*n));
    }
}
