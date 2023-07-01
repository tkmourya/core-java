package Polymorphism;
public class MotherBoard  {
    String brand;
    String version;
    MotherBoard(String brand,String version){
        this.version=version;
        this.brand=brand;
    }
}
class RoboVan {
    String name;
    String color;
    RoboVan(String name,String color){
        this.color=color;
        this.name=name;
    }
}
class Robo{
    MotherBoard mb = new MotherBoard("intel","9.9");
    public void hasA(RoboVan rv){
        System.out.println(rv.color);
        System.out.println(rv.name);
    }
}
class App{
    public static void main(String[] args) {
        Robo r = new Robo();
        RoboVan rv = new RoboVan("Farrari","red");
        // Before main object(Robo) is destroyed
        r.hasA(rv);
        System.out.println(r.mb.brand);
        System.out.println(r.mb.version);

        r=null; // destroyed r (Robo)

        // After main object(Robo) is destroyed
//        System.out.println(r.mb.brand);  // NullPointerException
//        System.out.println(r.mb.version);  //  NullPointerException
//        r.hasA(rv);  //  NullPointerException
        System.out.println(rv.name); // Farrari
        System.out.println(rv.color);// red
    }
}
