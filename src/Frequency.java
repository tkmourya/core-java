import java.util.Scanner;
public class Frequency
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name");
        String n = sc.nextLine();
        System.out.println("Please enter character want search");
        char ch = sc.next().charAt(0);
        char c[] = n.toCharArray();
            int count = 0;
            for(int i=0; i<c.length; i++)
            {
                if(c[i]==ch)
                {
                    count++;
                }
            }
        System.out.println("Frequency= "+count);
        }
    }

