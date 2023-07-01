public class StringMethod1 {
    public static void main(String[] args) {

        String s = "java is fun";
        String[] ar = s.split(" ");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}