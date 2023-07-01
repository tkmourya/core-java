package collection_program;

import java.util.HashMap;
import java.util.Scanner;

public class hashpr2_user_take {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,10);
        System.out.println(hm);

        int key=0;
        int value=0;
        int capacity=3000;
        int choice;
        do {
            System.out.println("""
                    1.get
                    2.put
                    3.exit""");
            System.out.println("enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //get value for the key
                    int key1;
                    System.out.println("enter the key");
                    key = sc.nextInt();
                  if(key>0 && key<=3000){
                      System.out.println(hm.get(key));
                  }
                  else {
                      return;
                  }

                    break;
                case 2: //add the key and value
                    System.out.println("enter the key");
                    key = sc.nextInt();
                    System.out.println("enter the value");
                    value = sc.nextInt();
                    hm.put(key, value);
                    break;
                case 3:
                    System.exit(0);
                    System.out.println("exited");
                default:
                    System.out.println("invalid input");
            }
        }while (choice!=3);
    }
}
