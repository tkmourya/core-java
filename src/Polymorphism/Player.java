package Polymorphism;

public class Player {
    public void play(){
        System.out.println("Playing game");
    }
    public void exercise(){
        System.out.println("Doing exercise");
    }
    public void diet(){
        System.out.println("eat healthy food");
    }
}
class Cricketer extends Player{
    public void play(){
        System.out.println("playing cricket");
    }
    public void exercise(){
        System.out.println("Lifting");
    }
    public void diet(){
        System.out.println("eating dry fruit");
    }
}
class Footballer extends Player{
    public void play(){
        System.out.println("playing football");
    }
    public void exercise(){
        System.out.println("running");
    }
    public void diet(){
        System.out.println("eating salad");
    }
}
class Wrestler extends Player{
    public void play(){
        System.out.println("Fighting");
    }
    public void exercise(){
        System.out.println("Jumping");
    }
    public void diet(){
        System.out.println("protein bar");
    }
}
class playerClub{
    public static void main(String[] args) {
        Cricketer c = new Cricketer();
        Footballer f = new Footballer();
        Wrestler w = new Wrestler();
        playerClub pc = new playerClub();
        pc.club(c); // c call object Cricketer
        pc.club(f);// f call object Footballer
        pc.club(w);// w call object Wrestler
    }
    public void club(Player p){
        p.play(); // call play method from Player class
        p.exercise(); // call exercise method Player class
        p.diet(); // call diet method player class
    }
}
