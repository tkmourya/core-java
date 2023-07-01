package Algorithm;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        //System.out.println("Please enter ");
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println("Please enter an element");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter key to search");
        int key = sc.nextInt();
        for(int i=0; i<arr.length-1; i++){
            if(key==arr[i])
            {
                System.out.println("key found at the index: "+i);
                System.exit(0);
            }
        }
        System.out.println("Key is not found");
    }
}