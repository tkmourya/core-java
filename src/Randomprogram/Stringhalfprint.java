package Randomprogram;

import java.util.Scanner;

public class Stringhalfprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String");
        String s1 = sc.next();
        for (int i=0;i<s1.length()/2;i++){
            System.out.print(s1.charAt(i));
        }
    }
}
