package Algorithm;

import java.util.Scanner;

public class Sorting
{
    void selectionSort(int a[])
    {
        int min;
        int pos;
        int help;
        for(int i=0; i<=a.length-2; i++)
        {
            min = a[i];
            pos = i;
            for(int j=0; j<=a.length-1; j++)
            {
                if(a[j]<min)
                {
                    min = a[j];
                    pos = j;
                }
            }
                help = a[i];
                a[i] = a[pos];
                a[pos] = help;
        }
    }
}
class SortingApp
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arrays length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println("enter an element");
            arr[i] = sc.nextInt();
        }
        System.out.println("array contents before sorting");
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Sorting s = new Sorting();
        s.selectionSort(arr);
        System.out.println("array contents after sorting");
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
