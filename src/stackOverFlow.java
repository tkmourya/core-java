public class stackOverFlow {
    public void fun(){
        System.out.println("fun() is executing");
        fun();
    }
    public static void main(String[] args) {
        stackOverFlow sof = new stackOverFlow();
        sof.fun();
    }
}
