package Encapsulation;

import java.util.Scanner;

public class Employee {
    private String name;
    private int salary;
    public Employee(String name, int salary, int pin){
        if(pin==5678){
            this.name = name;
            this.salary = salary;
        }
        else {
            System.out.println("Invalid pin");
            System.exit(0);
        }
    }
    public String getName(){
        return  this.name;
    }
    public int getSalary(){
        return  this.salary;
    }
}
class EmployeeApp{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter name");
        String name = s.nextLine();
        System.out.println("Please enter salary");
        int salary = s.nextInt();
        System.out.println("please enter pin");
        int pin = s.nextInt();
        Employee e = new Employee(name,salary,pin);
        System.out.println("Name:"+e.getName());
        System.out.println("Salary:"+e.getSalary());
    }
}