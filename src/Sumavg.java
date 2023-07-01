import java.util.Scanner;
public class Sumavg
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i <= n - 1; i++)
        {
            System.out.println("Please enter number for addition");
            num[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i <= n - 1; i++)
        {
            sum = sum + num[i];
        }
        System.out.println("Sum=" +sum);
        double avg = (sum/n);
        System.out.println("Avg="+avg);

        }
    }



