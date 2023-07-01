package question_bank;

import java.util.Arrays;

// Q -Write a program to rotate the elements of an array by ‘k’ times.
public class Element_rotateArray {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7,8,9};
        int temp = a[a.length-1];
    for(int i=a.length-1;i>0;i--){
    a[i]=a[i-1];
        }
    a[0]=temp;
        System.out.println(Arrays.toString(a));
    }
}
