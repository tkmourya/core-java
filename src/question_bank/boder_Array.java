package question_bank;
// Q -Write a program to print only the border elements of a 2-D array.
public class boder_Array {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        Boundary(a, 4, 4);
    }


    public static void Boundary(int a[][], int r,
                                int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0)
                    System.out.print(a[i][j] + " ");
                else if (i == r - 1)
                    System.out.print(a[i][j] + " ");
                else if (j == 0)
                    System.out.print(a[i][j] + " ");
                else if (j == c - 1)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}

