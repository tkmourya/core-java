import java.util.Scanner;
public class Age_array_loop
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter size");
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i=0; i<=size-1; i++)
        {
            System.out.println("please enter age");
            a[i] = s.nextInt();

        }
        for (int i=0; i<=size-1; i++)
        {
            System.out.println(a[i]);
        }

    }
}

