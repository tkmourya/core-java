package Polymorphism;

public class SecurityForce {
    public void attack(){
        System.out.println("Attack enemy");
    }
    public void defend(){
        System.out.println("Defend nation");
    }
}
class Army extends SecurityForce{
    public void attack(){
        System.out.println("Attack using tanks");
    }
    public void defend(){
        System.out.println("Defend from land");
    }
}
class Navy extends SecurityForce{
    public void attack(){
        System.out.println("Attack using ship");
    }
    public void defend(){
        System.out.println("Defend from water");
    }
}
class AirForce extends SecurityForce{
    public void attack(){
        System.out.println("Attack using jet");
    }
    public void defend(){
        System.out.println("Defend from air");
    }
}
class WarApp{
    public static void main(String[] args) {
        SecurityForce sf;
        Army arm = new Army();
        sf=arm;
        sf.attack();
        sf.defend();
        Navy nav = new Navy();
        sf=nav;
        sf.attack();
        sf.defend();
        AirForce air = new AirForce();
        sf=air;
        sf.attack();
        sf.defend();
    }
}
