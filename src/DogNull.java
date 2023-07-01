public class DogNull
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
    DogNull(String breed,String color,String name)
    {
        breed = breed;
        color = color;
        name = name;

    }
}
class Dog
{
    public static void main(String[] args)
    {
        DogNull dr = new DogNull("PUG","BROWN","SCOOBY");
        System.out.println(dr.breed+" "+dr.color+" "+dr.name);
        dr.bark();
        dr.play();
    }
}