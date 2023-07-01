package Polymorphism;
// Achiving polymorphism 1:3
public class SecurityForce1 {
        public void attack(){
            System.out.println("Attack enemy");
        }
        public void defend(){
            System.out.println("Defend nation");
        }
    }
    class Army1 extends SecurityForce1 {
        public void attack(){
            System.out.println("Attack using tanks");
        }
        public void defend(){
            System.out.println("Defend from land");
        }
    }
    class Navy1 extends SecurityForce1 {
        public void attack(){
            System.out.println("Attack using ship");
        }
        public void defend(){
            System.out.println("Defend from water");
        }
    }
    class AirForce1 extends SecurityForce1 {
        public void attack(){
            System.out.println("Attack using jet");
        }
        public void defend(){
            System.out.println("Defend from air");
        }
    }
    class WarApp1 {
        public static void main(String[] args) {
            Army1 arm = new Army1();
            Navy1 nav = new Navy1();
            AirForce1 air = new AirForce1();
            WarApp1 wa = new WarApp1();
            wa.dod(arm);
            wa.dod(nav);
            wa.dod(air);
        }
        public void dod(SecurityForce1 sf){
            sf.attack();
            sf.defend();
        }
    }