package Polymorphism;
// Is-A Relationship
public class Devise {
public void devise(){
    System.out.println("bulb is devise");
}
}
class Bulb extends Devise{
    public static void main(String[] args) {
        Devise d = new Devise();
        d.devise();
        System.out.println("Devise name bulb");
    }
}