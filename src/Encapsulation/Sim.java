package Encapsulation;

import java.util.Scanner;

public class Sim {
    private String serviceProvider;
    private int balance;
    public Sim(String serviceProvider, int balance, int key)
    {
        if(key==5566){
            this.serviceProvider = serviceProvider;
            this.balance = balance;
        }
        else {
            System.out.println("Invalid key");
            System.exit(0);
        }
    }
    public String getServiceProvider(){
        return  this.serviceProvider;
    }
    public int getBalance(){
        return  this.balance;
    }
}
class SimApp{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter service provider name");
        String serviceProvider = s.nextLine();
        System.out.println("Please put balance");
        int balance = s.nextInt();
        System.out.println("please enter key");
        int key = s.nextInt();
        Sim si = new Sim(serviceProvider,balance,key);
        System.out.println("Service Provider:"+si.getServiceProvider());
        System.out.println("Balance:"+si.getBalance());
    }}