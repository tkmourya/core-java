package question_bank;

import java.util.Scanner;

//Q -Write a program to accept an integer from the user and print all the factors of the number.
public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int n = sc.nextInt();
        System.out.print("Factors of "+n+" are : ");
        for(int i=1; i<=n; ++i)
        {
            if(n%i == 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
