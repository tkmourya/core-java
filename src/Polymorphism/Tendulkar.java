package Polymorphism;

public class Tendulkar {
    public void Play(){
        System.out.println("Play cricket");
    }
    public void Role(){
        System.out.println("I am batsman");
    }
}
class Arjun extends Tendulkar{
    // Overriding Method Role
    public void Role(){
        System.out.println("I am bowler");
    }
    // Specialized Method Smoke
    public void Smoke(){
        System.out.println("I smoke some time");
    }
}
class Apps{
    public static void main(String[] args) {
        Tendulkar t = new Arjun();
        t.Play();
        t.Role();
       // t.Smoke(); // error (limitation of parent class)
        // fix by using down casting
        ((Arjun)(t)).Smoke();
    }
}
