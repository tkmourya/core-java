package Randomprogram;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s1 = sc.nextLine();
        char arr[] = s1.toCharArray();
        String re="";
        for (int i=arr.length-1;i>=0;i--){
            re=re+arr[i];
}
        System.out.println(re);
        }
    }

