import java.util.*;
import java.sql.*;
public class StudentData {
    int roll;
    String name;
    double cgpa;
    StudentData(int roll,String name,double cgpa){
        this.roll=roll;
        this.name=name;
        this.cgpa=cgpa;
    }
}
class StudentDataApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter roll no:");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter name:");
        String name = sc.nextLine();
        System.out.println("Please enter your cgpa:");
        double cgpa = sc.nextDouble();
        StudentData sd = new StudentData(roll, name, cgpa);
        System.out.println("roll: "+sd.roll);
        System.out.println("name: "+sd.name);
        System.out.println("cgpa: "+sd.cgpa);
    }

}
