package Randomprogram;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter string");
        String s1 = sc.nextLine();
        char[] arr = s1.toCharArray();
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z' ){
                count++;
            }
        }
        System.out.println("No. of lowercase character : "+count);
    }
}
