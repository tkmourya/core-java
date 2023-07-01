package Inheritance;

public class Robo {
    public void move() {
        System.out.println(" Robo move fast");
    }
    public void learn() {
        System.out.println("Robo self-learn");
    }
    public void recharge() {
        System.out.println("plug-in to recharge");
    }
    public void interact() {
        System.out.println("Robo interact");
    }
}

class fighterRobo extends Robo{
    public void fight(){
        System.out.println("Fighter robo fight");
    }
}
class playerRobo extends Robo{
    public void play(){
        System.out.println("Player robo play");
    }
}
class teacherRobo extends Robo{
    public void teach(){
        System.out.println("Teacher robo teach");
    }
}

class RoboApp {
    public static void main(String[] args) {
        System.out.println("--------------------");
        fighterRobo fr = new fighterRobo();
        fr.move();
        fr.learn();
        fr.recharge();
        fr.interact();
        System.out.println("-----------------------------");
        playerRobo pr = new playerRobo();
        pr.move();
        pr.learn();
        pr.recharge();
        pr.interact();
        System.out.println("------------------------------");
        teacherRobo tr = new teacherRobo();
        tr.move();
        tr.learn();
        tr.recharge();
        tr.interact();
    }
}