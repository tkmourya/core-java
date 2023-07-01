class DogRobo
{
    String breed;
    String color;
    String name;
    public void bark()
    {
        System.out.println("Woof Woof");
    }
    public void play()
    {
        System.out.println("Play Fetch");
    }
    DogRobo(String b, String c, String n)
    {
        breed = b;
        color = c;
        name = n;
    }
}
class DogApp
{
    public static void main(String[] args)
    {
        DogRobo dr = new DogRobo("PUG","BROWN","SCOOBY");
        System.out.println(dr.breed+" "+dr.color+" "+dr.name);
        dr.bark();
        dr.play();
    }
}
