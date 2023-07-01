package question_bank;

import java.util.Scanner;

// Q -Write a java program to accept 2 integers from the user and perform arithmetic operations based on user choice (any 1 of addition, subtraction, multiplication, division).
import java.util.Scanner;

//public class arithmetic
//{
//    public static void main(String args[])
//    {
//        int first, second, add, subtract, multiply;
//        float divide;
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter Two Numbers : ");
//        first = scan.nextInt();
//        second = scan.nextInt();
//
//        add = first + second;
//        subtract = first - second;
//        multiply = first * second;
//        divide = (float) first / second;
//
//        System.out.println("Sum = " + add);
//        System.out.println("Difference = " + subtract);
//        System.out.println("Multiplication = " + multiply);
//        System.out.println("Division = " + divide);
//    }
//}
public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int a = sc.nextInt();
        System.out.println("please enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Please enter 1,2,3,4 for addition, subtraction, multiplication, divide respective");
        int c = sc.nextInt();
        float d;
        if(c==1){
            d=a+b;
            System.out.println(d);
        }
        if(c==2){
            d=a-b;
            System.out.println(d);
        }
        if(c==3){
            d=a*b;
            System.out.println(d);
        }
        if(c==4){
             d= (float) a/b;
            System.out.println(d);
        }
        else{
            System.out.println("Please  read carefully instruction above");
        }
    }
    }



