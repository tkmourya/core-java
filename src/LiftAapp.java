import java.util.Scanner;
// how many people enter in lift -> total no. of people weight  max 600kg
public class LiftAapp
{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter total number of people");
       int n = sc.nextInt();
       double[] wt = new double[n];
       for (int i = 0; i <= n - 1; i++)
       {
           System.out.println("Please enter the weight");
           wt[i] = sc.nextDouble();
       }
       double totalWt = 0;
       for (int i = 0; i <= n - 1; i++)
       {
           totalWt = totalWt + wt[i];
       }
           System.out.println("Total weight=" + totalWt);
           if (totalWt > 600)
           {
               System.out.println("Overload,not allowed");
           }
           else
           {
               System.out.println("Allowed,Please proceed");
           }
       }
   }

