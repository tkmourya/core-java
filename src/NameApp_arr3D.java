import java.util.Scanner;
public class NameApp_arr3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number schools");
        int b = sc.nextInt();
        System.out.println("Please enter number classes");
        int r = sc.nextInt();
        System.out.println("Please enter number students");
        int c = sc.nextInt();
        String[][][] n = new String[b][r][c];
        sc.nextLine();
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                for (int k = 0; k < n[i][j].length; k++) {
                    System.out.println("Please enter name");
                    n[i][j][k] = sc.nextLine();
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                for (int k = 0; k < n[i][j].length; k++) {
                    System.out.print(n[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
