class Carconstructor
{
    String brand;
    String color;
    int price;
    public void accelerate()
    {
        System.out.println("Move Faster");
    }
    Carconstructor(String b,String c,int p)
    {
        brand = b;
        color = c;
        price = p;
    }
}
class CarconstructorApp
{
    public static void main(String[] args)
    {
        Carconstructor c1 = new Carconstructor("AUDI","BLACK",1000000);
        Carconstructor c2 = new Carconstructor("MARUTHI","RED",250000);
        System.out.println("Brand:"+c1.brand);
        System.out.println("Color:"+c1.color);
        System.out.println("Price:"+c1.price);
        c1.accelerate();
        System.out.println("Brand:"+c2.brand);
        System.out.println("Color:"+c2.color);
        System.out.println("Price:"+c2.price);
        c2.accelerate();
    }
}