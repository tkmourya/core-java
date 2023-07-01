package Inheritance;

public class Animal {
    public void eat() {
        System.out.println(" Animal eat ");
    }

    public void sleep() {
        System.out.println(" Animal sleep");
    }
}
    class Tiger extends Animal{
        public void roar(){
            System.out.println(" Animal : Tiger roar");
        }
    }
    class Cat extends Animal{
        public void meow(){
            System.out.println(" Animal : Cat meow");
        }
    }

class AnimalApp{
    public static void main(String[] args) {
        System.out.println("--------------------");
        Tiger t = new Tiger();
        System.out.println("Output for tiger");
        t.eat();
        t.sleep();
        t.roar();
        System.out.println("--------------------");
        Cat  c = new Cat();
        System.out.println("Output for cat");
        c.eat();
        c.sleep();
        c.meow();

    }
}
