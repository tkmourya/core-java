public class Circle
{
    double r;
    double pi = 3.14;
    void FindArea()
    {
        double a =pi*r*r;
        System.out.println("Area="+a);
    }
}
class CircleApp
{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.r = 10;
        c1.FindArea();
        Circle c2 = new Circle();
        c2.r = 5.5;
        c2.FindArea();
    }
}
