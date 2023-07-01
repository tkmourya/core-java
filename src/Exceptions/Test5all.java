package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test5all {
    public static void main(String[] args) {
        System.out.println("App is starting");
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println(arr.length);
            System.out.println(arr[5]);
        }catch (NegativeArraySizeException ne){
            System.out.println("please enter a positive integer");
        }
        catch (InputMismatchException ie){
            System.out.println("please enter only numeric values");
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Please enter size>=6");
        }
        catch (Exception e){
            System.out.println("Exception was handled");
        }
        System.out.println("App is stopping");
    }
}
