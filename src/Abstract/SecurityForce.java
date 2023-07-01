package Abstract;

abstract public class SecurityForce {
    abstract public void attack();
    abstract public void defend();
}
class Army extends SecurityForce{
public void attack(){
        System.out.println("Attack using tanks");
        }
public void defend(){
        System.out.println("Defend from land");
        }
        }
class Navy extends SecurityForce {
    public void attack(){
        System.out.println("Attack using ship");
    }
    public void defend(){
        System.out.println("Defend from water");
    }
}
class AirForce extends SecurityForce {
    public void attack(){
        System.out.println("Attack using jet");
    }
    public void defend(){
        System.out.println("Defend from air");
    }
}
class WarApp{
    public static void main(String[] args) {
        Army arm = new Army();
        Navy nav = new Navy();
        AirForce air = new AirForce();
        protect(arm);
        protect(nav);
        protect(air);
    }
    public static void protect(SecurityForce sf){
        sf.attack();
        sf.defend();
    }
}
