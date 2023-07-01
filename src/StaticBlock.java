public class StaticBlock
{
    static {
        System.out.println("Control is inside static block");
    }
    public static void main(String[] args) {
        {
            System.out.println("Control is inside main()");
        }
    }
}
