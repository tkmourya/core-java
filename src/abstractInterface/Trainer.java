package abstractInterface;

public interface Trainer {
    void teach();
    void takeAttendance();
}
class JavaTrainer implements Trainer{

    @Override
    public void teach() {
        System.out.println("Teach Java");
    }

    @Override
    public void takeAttendance() {
        System.out.println("Take attendance after teach");
    }
}
class MtTrainer implements Trainer{

    @Override
    public void teach() {
        System.out.println("Teach MT");
    }

    @Override
    public void takeAttendance() {
        System.out.println("Take attendance before teach");
    }
}
class App2{
    public static void main(String[] args) {
        JavaTrainer j = new JavaTrainer();
        MtTrainer mt = new MtTrainer();
        prepare(j);
        prepare(mt);
    }
    public static void prepare(Trainer t){
        t.teach();
        t.takeAttendance();
    }
}