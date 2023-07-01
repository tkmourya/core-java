package Inheritance;
//Hierarchical Inheritance(1 parent class<--3 child class)
class NationSecurity {
    public void attack() {
        System.out.println("Attack and destroy");
    }

    public void defend() {
        System.out.println("Best defend is good offense");
    }
}
class Army extends NationSecurity{

}
class Navy extends NationSecurity{

}
class Airforce extends NationSecurity{

}
class NSA{
    public static void main(String[] args) {
        Army a = new Army();
        a.attack();
        a.defend();
        Navy n = new Navy();
        n.attack();
        n.defend();
        Airforce ai = new Airforce();
        ai.attack();
        ai.defend();
    }
}