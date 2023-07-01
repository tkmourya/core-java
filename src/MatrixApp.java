import java.util.Scanner;
public class MatrixApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of row");
        int r = sc.nextInt();
        System.out.println("Please enter number of column");
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.println("Please enter number");
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println("Displaying array");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
