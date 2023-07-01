package Polymorphism;

public class Final_keyword {
    int x = 10;
    final int y = 100; // make a constant
    public static void main(String[] args){
        Final_keyword f = new Final_keyword();
        System.out.println(f.x);
        System.out.println(f.y);
        f.x=20;
        System.out.println(f.x);
       // f.y=200; // error because final keyword use in y
    }
}
class KodNestStudent{
    final public void study(){
        System.out.println("study for 6 hours");
    }
}
class DecemberKodNestStudent extends KodNestStudent{
   // public void study() //through error because study() made final in parent class so not inherited in other class
    {
        System.out.println("Study for 6 minutes");
    }
}