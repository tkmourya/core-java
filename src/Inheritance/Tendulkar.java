package Inheritance;

public class Tendulkar {
    public void play(){
        System.out.println("play cricket");
    }
    public void role(){
        System.out.println("i am batsman");
    }
}
class Arjun extends Tendulkar{
    public void role(){ // overridden role
        System.out.println("I am bowler");
    }
    public void smoke(){
        System.out.println("I am smoking 1 time");
    }
}
class Cricketer{
    public static void main(String[] args) {
        Arjun A = new Arjun();
        A.play();
        A.role();
        A.smoke();
    }
}
