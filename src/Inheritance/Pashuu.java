package Inheritance;
public class Pashuu {
    public void move2(){
        System.out.println("Animal move");
    }
    public void sleep2(){
        System.out.println("Animal sleep");
    }
}
class carnivores extends Pashuu{
    public void hunt2(){
        System.out.println("Hunt to eat");
    }
}
class hierarchical extends Pashuu{
    public void farm2(){
        System.out.println("Farm to eat");
    }
}
class omnivores extends Pashuu{
    public void buy(){
        System.out.println("Buy to eat");
    }
}
class cow extends hierarchical{

}
class tit extends carnivores{

}
class dog extends omnivores{

}
class pashuApp{
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        cow c = new cow();
        c.move2();
        c.sleep2();
        c.farm2();
        System.out.println("---------------------------------------");
        tit ti = new tit();
        ti.move2();
        ti.sleep2();
        ti.hunt2();
        System.out.println("---------------------------------------");
        dog d = new dog();
        d.move2();
        d.sleep2();
        d.buy();
    }
}
