import java.util.Scanner;
public class SearchApp
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter size of array");
        int n = sc.nextInt(); // accepting value(array size)
        int[] a = new int[n];// storing value
        for(int i=0 ; i<n; i++)
        {
            System.out.println("Please enter element");
                    a[i] = sc.nextInt();// accepting element value(enter by user)
        }
        System.out.println("Please enter value to search");// searching value enter by user--
        int key = sc.nextInt();// accepting
       // boolean found = false;
        for(int i=0; i<n; i++)
        {
            if (a[i] == key) // a[i] = value enter by user equal to key(searching by user)
            {
                System.out.println("element is present");
                System.exit(0);
                /*found = true;
                break;// stop condition*/
            }
        }
        System.out.print("element is not present");
        /*if(found==true)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("Element is not present");
        }*/
    }
}
