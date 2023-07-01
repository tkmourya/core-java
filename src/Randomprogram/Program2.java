package Randomprogram;

import java.util.Scanner;

public class Program2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter string");
        String s1 = sc.nextLine();
        char[] arr = s1.toCharArray();
        int lowerCount=0, upperCount=0,numCount=0,specialCount=0,spaceCount=0;
        /*for(int i=0; i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z' ){
                lowerCount++;
            }
            else if(arr[i]>='A' && arr[i]<='Z'){
                upperCount++;
            }
            else if (arr[i]>='0' && arr[i]<='9') {
                numCount++;
            }
            else if(arr[i]==' '){
                spaceCount++;
            }
            else {
                specialCount++;
            }*/
        // for each loop(advance loop)
        for (char c : arr) {
            if (c >= 'a' && c <= 'z') {
                lowerCount++;
            } else if (c >= 'A' && c <= 'Z') {
                upperCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            } else if (c == ' ') {
                spaceCount++;
            } else {
                specialCount++;
            }
        }
        System.out.println("No. of lowercase character : "+lowerCount);
        System.out.println("No. of upper character : "+upperCount);
        System.out.println("No. of numbers character : "+numCount);
        System.out.println("No. of special character : "+specialCount);
        System.out.println("No. of spaces : "+spaceCount);
    }
}