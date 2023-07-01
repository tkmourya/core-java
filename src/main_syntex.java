public class main_syntex {
    public static void main(String[] args) {
        System.out.println("main-1");
        main(3);
    }
    public static void main(int args) {
        System.out.println("main-2");
        main();
    }
    public static void main() {
        System.out.println("main-3");
    }
}
