package demoStatic;

public class demob
{
    static
    {
        System.out.println("static block1");// static block
    }

    public static void main(String[] args)
    {
        System.out.println("main method");
    }
    {
        System.out.println("non-static block");//non-static block is not execute, when object create(demob d = new demob();) then execute non-static block
    }
    static
    {
        System.out.println("static block2");// static block
    }
}
