class Car
{
    String brand;
    String color;
    int price;
    public void accelerate() {
        System.out.println("Move Faster");
    }
}
class CarApp
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        System.out.println("Brand:"+c1.brand);
        System.out.println("Color:"+c1.color);
        System.out.println("Price:"+c1.price);
        c1.accelerate();
    }
}
