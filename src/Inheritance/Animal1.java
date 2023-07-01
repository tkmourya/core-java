package Inheritance;
//Multi_level Inheritance
public class Animal1 {
    public void move1(){
        System.out.println("move to forest");
    }
    public void sleep1(){
        System.out.println("sleeping");
    }
}
 class Carnivores extends Animal1{
    public void hunt(){
        System.out.println("Hunting");
    }

}
 class tiger extends Carnivores
{

}
class Multilevel {
    public static void main(String[] args) {
        Carnivores C = new Carnivores();
        C.move1();
        C.sleep1();
        C.hunt();
        tiger t = new tiger();
        t.move1();
        t.sleep1();
        t.hunt();




    }
}