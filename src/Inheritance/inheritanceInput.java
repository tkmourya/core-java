package Inheritance;

public class inheritanceInput {
    String name;
    int num;
    int age;
    float temp;
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


    class fi extends inheritanceInput {
        public void fight(){
            System.out.println("Fighter robo fight");
        }
    }
    class pl extends inheritanceInput {
        public void play(){
            System.out.println("Player robo play");
        }
    }
    class te extends inheritanceInput {
        public void teach(){
            System.out.println("Teacher robo teach");
        }
        te(String name,int num,int age,float temp){
            this.name = name;
            this.num = num;
           this.age = age;
            this.temp = temp;
        }
    }

    class momo {
        public static void main(String[] args) {
            System.out.println("--------------------");
            inheritanceInput fr = new inheritanceInput();
            te ttt = new te("ssdd",54, 45, 32.6f);
            System.out.println(ttt.name+" "+ttt.age+" "+ ttt.num+" "+ ttt.temp);
            //System.out.println(fr.name);

            fr.move();
            fr.learn();
            fr.recharge();
            fr.interact();
            System.out.println("-----------------------------");
            inheritanceInput pr = new inheritanceInput();
            pr.move();
            pr.learn();
            pr.recharge();
            pr.interact();
            System.out.println("------------------------------");
            inheritanceInput tr = new inheritanceInput();
            tr.move();
            tr.learn();
            tr.recharge();
            tr.interact();
        }
    }