package question_bank;
//Q -Write a program to print all the even numbers between ‘a’ & ‘b’, where ‘a’ & ‘b’ are integers entered by the user.
import java.util.Scanner;

public class Alleven {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please first no");
        int A1 = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("enter second no.");
        int A2 = b.nextInt();
        System.out.print("All even number : ");
        int i=A1;
        while (i<=A2){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
//       for (int i =A1;i<=A2;i++){
//           if (i%2==0){
//            System.out.print(i+" ");}
//       }

    }
}
