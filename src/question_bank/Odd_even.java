package question_bank;
//Q -Write a program to accept an integer from the user and print whether its odd or even.
import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
