public class StudentStatic
{
    String name;
    static double cgpa;
    void study()
    {
        System.out.println("A student studies");
    }
    void play()
    {
        System.out.println("Student play PUBG");
    }
    static void cgpaToPer()
    {
        System.out.println("Percentage="+(cgpa*10));
    }
}
class StudentStaticApp
{
    public static void main(String[] args) {
        StudentStatic ss = new StudentStatic();
        ss.name = "Aalia";
        ss.cgpa = 7.9;
        System.out.println("NAME:"+ss.name);
        System.out.println("CGPA:"+ss.cgpa);
        ss.study();
        ss.play();
        StudentStatic.cgpaToPer();
    }
}
