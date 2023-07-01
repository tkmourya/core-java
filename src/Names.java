import java.util.Scanner;
public class Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row size array");
        int r = sc.nextInt(); // accepting value(array size)
        System.out.println("Please enter column size array");
        int c = sc.nextInt();
        String[][] a = new String[r][c];// storing two value
        sc.nextLine();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Please enter name");
                a[i][j] = sc.nextLine();// accepting name value(enter by user)
            }
        }
        System.out.println("displaying name");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) ;
            {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
