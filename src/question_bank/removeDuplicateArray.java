package question_bank;
// Q -Write a program to remove duplicates from an array.
public class removeDuplicateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        System.out.println("New array:");
        for (int k = 0; k < j; k++) {
            System.out.print(temp[k] + " ");
        }
    }
}