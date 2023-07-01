import java.util.Scanner;

public class LotteryApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0; i<=n-1; i++)
        {
            System.out.println("Please enter your lucky number");
            num[i] = sc.nextInt();
        }
        System.out.println("Please enter your guess number");
        int gn = sc.nextInt();
        boolean found = false;
        for(int i=0; i<=n-1;i++)
        {
            if (num[i] == gn)
            {
                found = true;
                break;
            }
        }
            if(found == true)
            {
                System.out.println("congratulation");
            }
            else
            {
                System.out.println("Better next time");
            }
        }
    }


