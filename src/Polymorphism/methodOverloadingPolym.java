package Polymorphism;
//method overloading(Compile-time polymorphism)
//method overriding(Run-time polymorphism)
import java.sql.SQLOutput;

public class methodOverloadingPolym {
    int a,b,c;
    public void add(int x,int y){
        a = x;
        b = y;
        System.out.println("Addition of a+b is :"+ (a+b));
    }
    public void add(int x , int y, int z){
        a = x;
        b = y;
        c = z;
        System.out.println("Addition of a+b+c is :"+(a+b+c));
    }
    public void print(){
        System.out.println("class parent(methodOverloadingPolym) method is running");
    }
}
class sub extends methodOverloadingPolym{
    public void print(){
        System.out.println("Class sub method is running ");
    }

    public static void main(String[] args) {
        methodOverloadingPolym mop = new methodOverloadingPolym();
        //method overloading(Compile-time polymorphism)
        mop.add(4,7);
        //method overloading(Compile-time polymorphism)
        mop.add(5,9,6);
        sub s = new sub();
        //method overriding(Run-time polymorphism)
        s.print();
        // Also called parent class by inherited
        s.add(5,7);
    }
}
