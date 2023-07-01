package question_bank;
//Q -Write a program to accept an integer from user and print its table (till 10 times) in the following format: For example, if user enters 5, output should be:
// 5 x 1 = 5


import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
