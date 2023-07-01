package question_bank;

import java.util.Scanner;

//Q - Write a program to check whether a given number is present in an array or not.
public class check_numArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pleas enter array length");
        int n = sc.nextInt();
        int a[] = new int[n];//store array size or length
        for(int i = 0; i < a.length; i++){
            System.out.println("please enter number of elements");
            a[i] = sc.nextInt();// store elements ex- {1,2,3,4,5,6,7,8...}
        }
       // int[] a = new int[]{1,2,3,4,5,6};
        System.out.println("Search the element present in array");
        int search = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                System.out.println("Element is present");
                System.exit(0);
            }
        }
                System.out.println("Element is not present");
            }
        }


