public class DogThis
{
    String breed;
    String  color;
    String name;
    public void bark()
    {
        System.out.println("Woof Woof");
    }
    public void play()
    {
        System.out.println("Play Fetch");
    }
    DogThis(String breed,String color,String name)
    {
        this.breed = breed;
        this.color = color;
        this.name = name;
    }
}
class DogThisApp
{
    public static void main(String[] args)
    {
        DogThis dt = new DogThis("PUGO", "BLACK", "TOM");
        System.out.println(dt.breed + " " + dt.color + " " + dt.name);
        dt.bark();
        dt.play();
    }
}
