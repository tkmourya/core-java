package collection_program;
import java.util.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class pr2_user_take {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);
        int choice;
        int ele;
        System.out.println("""
                1.add the element at the beginning
                2.add the element at the last
                3.remove the element start list
                4.display all the element
                5. for exit""");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(">>>enter you choice");
             choice = sc.nextInt();


            switch (choice) {

                case 1:
                    System.out.println("enter the element at the first");
                    ele = sc.nextInt();
                    ll.addFirst(ele);
                    break;
                case 2:
                    System.out.println("enter the element at the last");
                    ele = sc.nextInt();
                    ll.addLast(ele);
                    break;
                case 3:
                    ll.remove();
                    break;
                case 4:
                    System.out.println(ll);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");

            }
        }while (choice!=5);

    }
}