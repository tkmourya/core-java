package question_bank;
//Q -Write a program to calculate the sum of all the elements present in an array.
import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pleas enter array length");
        int n = sc.nextInt();
        int a[] = new int[n];//store array size or length
        for(int i = 0; i < a.length; i++){
            System.out.println("please enter number of elements");
            a[i] = sc.nextInt();// store elements ex- {1,2,3,4,5,6,7,8...}
        }
       //int[] a = new int[]{1,2,3,4,5,6};
        int sum=0;
        for(int j=0; j<a.length; j++)
        {
            sum=sum+a[j];
        }
        System.out.println("Sum of all elements of an array: "+sum);
    }
}
